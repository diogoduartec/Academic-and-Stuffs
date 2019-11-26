import cryptocommon

# ---- Funções Públicas----

# Computa a encriptação de um bloco dado (8-element bytelist) com uma
# chave fornecida (16-element bytelist), retornando um novo 8-elemente bytelist
def encrypt(block, key, printdebug=False):
	return _crypt(block, key, "encrypt", printdebug)


# Computa a decriptação de um bloco dado (8-element bytelist) com uma
# chave fornecida (16-element bytelist), retornando um novo 8-elemente bytelist
def decrypt(block, key, printdebug=False):
	return _crypt(block, key, "decrypt", printdebug)


# ---- Funções Privadas de Cifragem ----

def _crypt(block, key, direction, printdebug):
	# Checa os argumentos de entrada
	assert isinstance(block, list) and len(block) == 8
	assert isinstance(key, list) and len(key) == 16
	assert direction in ("encrypt", "decrypt")
	if printdebug: print("ideacipher.{}(block = {}, key = {})".format(direction, cryptocommon.bytelist_to_debugstr(block), cryptocommon.bytelist_to_debugstr(key)))
	
	# Computa e trata o cronograma da chave
	keyschedule = _expand_key_schedule(key)
	if direction == "decrypt":
		keyschedule = _invert_key_schedule(keyschedule)
	
	# Empacota os blocos de bytes em váriaveis como uint16 em big indian
	w = block[0] << 8 | block[1]
	x = block[2] << 8 | block[3]
	y = block[4] << 8 | block[5]
	z = block[6] << 8 | block[7]
	
	# Executa 8 rounds de encriptação/decriptação
	for i in range(_NUM_ROUNDS):
		if printdebug: print("    Round {}: block = [{:04X} {:04X} {:04X} {:04X}]".format(i, w, x, y, z))
		j = i * 6
		w = _multiply(w, keyschedule[j + 0])
		x = _add(x, keyschedule[j + 1])
		y = _add(y, keyschedule[j + 2])
		z = _multiply(z, keyschedule[j + 3])
		u = _multiply(w ^ y, keyschedule[j + 4])
		v = _multiply(_add(x ^ z, u), keyschedule[j + 5])
		u = _add(u, v)
		w ^= v
		x ^= u
		y ^= v
		z ^= u
		x, y = y, x
	
	# Executa o round final
	if printdebug: print("    Round {}: block = [{:04X} {:04X} {:04X} {:04X}]".format(_NUM_ROUNDS, w, x, y, z))
	x, y = y, x
	w = _multiply(w, keyschedule[-4])
	x = _add(x, keyschedule[-3])
	y = _add(y, keyschedule[-2])
	z = _multiply(z, keyschedule[-1])
	
	# Serializa o bloco final como um bytelist em big indian
	return [
		w >> 8, w & 0xFF,
		x >> 8, x & 0xFF,
		y >> 8, y & 0xFF,
		z >> 8, z & 0xFF]


# Dado um 16-element bytelist, isso computa e retorna uma tupla contendo 52 elementos de uint16.
def _expand_key_schedule(key):
	# Empacota todos os bytes da chave em um único uint128
	bigkey = 0
	for b in key:
		assert 0 <= b <= 0xFF
		bigkey = (bigkey << 8) | b
	assert 0 <= bigkey < (1 << 128)
	
	# Concatena o prefixo de 16 bits no sufixo para produzir um uint144
	bigkey = (bigkey << 16) | (bigkey >> 112)
	
	# Extrai consecutivos blocos de 16bits com diferentes deslocamentos para formar o cronograma de chaves
	result = []
	for i in range(_NUM_ROUNDS * 6 + 4):
		offset = (i * 16 + i // 8 * 25) % 128
		result.append((bigkey >> (128 - offset)) & 0xFFFF)
	return tuple(result)


# Dado um cronograma de chaves, isso computa e retorna o cronograma de decriptação
# como uma tupla contendo 52 elementos de uint16.
def _invert_key_schedule(keysch):
	assert isinstance(keysch, tuple) and len(keysch) % 6 == 4
	result = []
	result.append(_reciprocal(keysch[-4]))
	result.append(_negate(keysch[-3]))
	result.append(_negate(keysch[-2]))
	result.append(_reciprocal(keysch[-1]))
	result.append(keysch[-6])
	result.append(keysch[-5])
	
	for i in range(1, _NUM_ROUNDS):
		j = i * 6
		result.append(_reciprocal(keysch[-j - 4]))
		result.append(_negate(keysch[-j - 2]))
		result.append(_negate(keysch[-j - 3]))
		result.append(_reciprocal(keysch[-j - 1]))
		result.append(keysch[-j - 6])
		result.append(keysch[-j - 5])
	
	result.append(_reciprocal(keysch[0]))
	result.append(_negate(keysch[1]))
	result.append(_negate(keysch[2]))
	result.append(_reciprocal(keysch[3]))
	return tuple(result)


# ---- Funções Privadas Aritméticas ----

# Retorna x + y modulo 2^16. Entrada e Saída são uint16. Usado apenas por _crypt().
def _add(x, y):
	assert 0 <= x <= 0xFFFF
	assert 0 <= y <= 0xFFFF
	return (x + y) & 0xFFFF # mesmo que (x + y) % (2**16)


# Retorna x * y modulo (2^16 + 1), onde 0x0000 é tratado como 0x10000.
# Entrada e Saída são uint16. Observar que 2^16+1 é primo. Usado apenas por _crypt().
def _multiply(x, y):
	assert 0 <= x <= 0xFFFF
	assert 0 <= y <= 0xFFFF
	if x == 0x0000:
		x = 0x10000
	if y == 0x0000:
		y = 0x10000
	z = (x * y) % 0x10001
	if z == 0x10000:
		z = 0x0000
	assert 0 <= z <= 0xFFFF
	return z


# Retorna o inverso aditivo de x modulo 2^16.
# Entrada e saída são uint16. Usado apenas por _invert_key_schedule().
def _negate(x):
	assert 0 <= x <= 0xFFFF
	return (-x) & 0xFFFF #mesmo que (2**16)-x


# Retorna o inverso multiplicativo de x modulo (2^16 +1), onde 0x0000 é
# tratado como 0x10000. Entrada e saída são uint16. Usado somente por _invert_key_schedule().
def _reciprocal(x):
	assert 0 <= x <= 0xFFFF
	if x == 0:
		return 0
	else:
		return pow(x, 0xFFFF, 0x10001)  # Pelo pequeno teorema de Fermat


# ---- Contantes numéricas/tabelas ----

_NUM_ROUNDS = 8


# ---- Low-level arithmetic functions and constants ----

UINT32_MASK = (1 << 32) - 1  # 0xFFFF FFFF
UINT64_MASK = (1 << 64) - 1  # 0xFFFF FFFF FFFF FFFF


# 'value' must be uint32, 'amount' must be in the range [0, 32), and the result is uint32.
def rotate_left_uint32(value, amount):
	assert 0 <= value <= UINT32_MASK
	assert 0 <= amount < 32
	return ((value << amount) | (value >> (32 - amount))) & UINT32_MASK


# 'value' must be uint32, 'amount' must be in the range [0, 32), and the result is uint32.
def rotate_right_uint32(value, amount):
	assert 0 <= value <= UINT32_MASK
	assert 0 <= amount < 32
	return ((value << (32 - amount)) | (value >> amount)) & UINT32_MASK


# 'value' must be uint64, 'amount' must be in the range [0, 64), and the result is uint64.
def rotate_left_uint64(value, amount):
	assert 0 <= value <= UINT64_MASK
	assert 0 <= amount < 64
	return ((value << amount) | (value >> (64 - amount))) & UINT64_MASK


# 'value' must be uint64, 'amount' must be in the range [0, 64), and the result is uint64.
def rotate_right_uint64(value, amount):
	assert 0 <= value <= UINT64_MASK
	assert 0 <= amount < 64
	return ((value << (64 - amount)) | (value >> amount)) & UINT64_MASK


# ---- Data conversion functions ----

# For example: asciistr_to_bytelist("0Az") -> [48, 65, 122].
def asciistr_to_bytelist(asciistr):
	return list(map(ord, asciistr))


# For example: hexstr_to_bytelist("FF00C0") -> [255, 0, 192].
def hexstr_to_bytelist(hexstr):
	assert len(hexstr) % 2 == 0
	return [int(hexstr[i : i + 2], 16) for i in range(0, len(hexstr), 2)]


# For example: bytelist_to_hexstr([255, 0, 192]) -> "FF00C0".
def bytelist_to_hexstr(bytelist):
	assert isinstance(bytelist, (list, tuple))
	return "".join("{:02X}".format(b) for b in bytelist)


# For example: bytelist_to_debugstr([255, 0, 192]) -> "[FF 00 C0]".
def bytelist_to_debugstr(bytelist):
	assert isinstance(bytelist, (list, tuple))
	return "[" + " ".join("{:02X}".format(b) for b in bytelist) + "]"


from textwrap import wrap

from utils import *

class RSA:
    def __init__(self):
        p = get_rdm_prime_nb()
        q = get_rdm_prime_nb(to_ignore = [p])
        
        self.pub_k, self.priv_k = gen_keys(p, q)
        self.cont = 0

    def get_public_key(self):
        key = ''.join(map(lambda x: str(x)+' ', self.pub_k))
        return key

    def get_private_key(self):
        return self.priv_k

    def get_encrypt_message(self, public_key, message):
        key = []
        pub = public_key.strip().split()
        for p in pub:
            key.append(int(p))

        enc =  encrypt(tuple(key), message)
        enc_message = ''.join(map(lambda x: str(x)+' ', enc))
        return enc_message
        return enc

    def get_decrypt_message(self, private_key, message):
        
        m = message.strip().split(' ')
        mess = []
        for i in m:
            mess.append(int(i))
        

        return decrypt(private_key, mess)


'''
if __name__ == '__main__':
    msg = input('Please write your message:\n> ')
    print()

    p = get_rdm_prime_nb()
    q = get_rdm_prime_nb(to_ignore=[p])
    print(f'p = {p} ; q = {q}')
    print()

    pub_k, priv_k = gen_keys(p, q)

    print(f'public key: {pub_k}\nprivate key: {priv_k}')
    print()

    print(f'Original message:\n{msg}')
    print()

    ciphertext = encrypt(pub_k, msg)
    print('Encrypted message:')
    txt = ''.join(map(lambda x: str(x), ciphertext))
    print('\n'.join(wrap(txt, width=70)))
    print()

    decrypted = decrypt(priv_k, ciphertext)
    print('Decrypted message:')
    print(''.join(map(lambda x: str(x), decrypted)))
'''















from my_idea import *
from cryptocommon import *
from random import randint
import random
class IDEA:
    
    def __init__(self):
        self.serialized_key = ''
        self.key = []
        
        for i in range(16):
            self.key.append(random.randint(0, 0xFF))
        self.serialized_key = ''.join(map(lambda x: str(x) + ' ', self.key))
    
    def get_serialized_key(self):
        return self.serialized_key

    def set_key(self, serialized_key):
        s_key = serialized_key.strip().split()
        self.key = []
        for k in s_key:
            self.key.append(int(k)) 

    def get_key(self):
        return self.key

    def str_to_bytelist(self, mensagem):
        t = len(mensagem)
        b , r = (t >> 3) , (t & 7)
        ans = []
        for i in range(b):
            ans.append(asciistr_to_bytelist(mensagem[(i << 3):(i + 1) << 3]))
        ans.append(asciistr_to_bytelist(mensagem[-r:]+' '*(8-r)))
        return ans

    def bytelist_to_str(self, blocks):
        ans = ''
        for block in blocks:
            ans += ''.join([chr(number) for number in block])
        return ans

    def code(self, blocks, chave):
        ans = []
        for block in blocks:
            ans.append(encrypt(block, chave))
        return ans

    def decode(self, blocks, chave):
        ans = []
        for block in blocks:
            ans.append(decrypt(block, chave))
        return ans

    def get_encrypt_message(self, message, chave):
        bytelist = self.str_to_bytelist(message)
        message_coded = self.code(bytelist, chave)
        
        mess = ''

        for i in message_coded:
            for j in i:
                mess += ''.join(map(lambda x: str(x) + ' ', i))
                
        return mess 

    def get_decrypt_message(self, message, chave):

        message_list = message.strip().split(' ')
        mess = []
        i = 0
        while i < len(message_list)/4:
            for j in range(i, (i+1)*4):
                mess.append(int(j))

        bytelist_decoded = self.decode(mess, chave)

        message_decoded = self.bytelist_to_str(bytelist_decoded)
        return message_decoded


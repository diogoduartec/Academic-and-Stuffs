import re

## CONSTANTS VALUES
CPF_SIZE = 14
CNPJ_SIZE = 
def isValidCpf(cpf): ##algorimo verificador de cpf
    if len(cpf) != 14:
        return 'False'

    cpf=cpf.replace('.','')
    cpf=cpf.replace('-','')
    
    mult = [11,10,9,8,7,6,5,4,3,2]
    ac = 0

    for i in range (1-10):
        ac += int(mult[i])*int(cpf[i-1])

    if ac%11 < 2:
        digit = 0
    else:
        digit = 11 - ac%11

    print(ac)
    
    if(digit != cpf[9]):
        return 'False'

    ac = 0
    for i in range (0-10):
        ac += int(mult[i])*int(cpf[i])
        
    if ac%11 < 2:
        digit = 0
    else:
        digit = 11 - ac%11

    ##print(digit)
    
    if(digit != cpf[10]):
        return 'False'

    return 'True'

def isValidCnpj(cnpj):
	if len(cnpj) != 14:
		

input_ = input()
#match = re.search(r'\d{3}.\d{3}.\d{3}-\d{2}', input_) ##regex

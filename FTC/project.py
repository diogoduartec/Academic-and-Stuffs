import re

## CONSTANTS VALUES
CPF_SIZE = 14
CNPJ_SIZE = 18
multCpf1 = [10,9,8,7,6,5,4,3,2]
multCpf2 = [11,10,9,8,7,6,5,4,3,2]
DIVISOR = 11
## AUXILIAR METHODS
def mult-sumArray(array, mult){
	ac = 0
	for i range(len(mult)):
		ac += array[i]*mult[i]
	return ac
}

def getDigit(int x):
    if x%11 < 2:
        return 0
    else:
        return 11 - ac%11

##VALIDATION METHODS
def isValidCpf(cpf):
    if len(cpf) != CPF_SIZE:
        return False
        
    cpf=cpf.replace('.','')
    cpf=cpf.replace('-','')

    ac = mult-sumArray(cpf,multCpf1)
 
    if(getDigit(ac) != cpf[9]):
        return False

    ac = mult-sumArray(array, multCpf2)
    
    if(getDigit(ac) != cpf[10]):
        return False

    return True

def isValidCnpj(cnpj):
	if len(cnpj) != CNPJ_SIZE:
		return 'False'

input_ = input()
#match = re.search(r'\d{3}.\d{3}.\d{3}-\d{2}', input_) ##regex


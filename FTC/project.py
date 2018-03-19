import re

## CONSTANTS VALUES
CPF_SIZE = 14
CNPJ_SIZE = 18


DIVISOR = 11


## AUXILIAR METHODS
def multSumArray(array, mult):
	ac = 0
	for i in range(len(mult)):
		ac += int(array[i])*int(mult[i])
	return ac
    

def getDigit(ac):
    if ac%11 < 2:
        return 0
    else:
        return 11 - ac%11

##VALIDATION METHODS
def isValidCpf(cpf):
    multCpf1 = [10,9,8,7,6,5,4,3,2]
    multCpf2 = [11,10,9,8,7,6,5,4,3,2]
    
    if len(cpf) != CPF_SIZE:
        return False
        
    cpf=cpf.replace('.','')
    cpf=cpf.replace('-','')

    ac = multSumArray(cpf,multCpf1)
    
    if(getDigit(ac) != int(cpf[9])):
        return False
    
    ac = multSumArray(cpf, multCpf2)
    
    if(getDigit(ac) != int(cpf[10])):
        return False

    return True


def isValidCnpj(cnpj):
    multCnpj = [5,4,3,2,9,8,7,6,5,4,3,2]
    
    if len(cnpj) != CNPJ_SIZE:
        return False

    cnpj = cnpj.replace('.','')
    cnpj = cnpj.replace('-','')
    cnpj = cnpj.replace('/','')

    ac = multSumArray(cnpj,(multCnpj))
    
    if(getDigit(ac) != int(cnpj[12])):
        return False

    multCnpj = [cnpj[12]] + multCnpj;
    ac = multSumArray(cnpj, multCnpj)
    
    if(getDigit(ac) != int(cnpj[13])):
        return False

    return True

input_ = input()

##match = re.search(r'(\d{3}.){2}\d{3}-\d{2}', input_) ##cpf
##match = re.search(r'\d{2}(.\d{3}){2}/\d{4}-\d{2}', input_) ##cnpj
##match = re.search(r'\d{4}.(1[0-2])|(0[1-9]).([0-2][0-9])|(3[0-1])] ([0-1][0-9])|(2[0-4]):[0-5][0-9]:[0-5][0-9]', input_) ## datetime without bisext or month validation

if match:
    print('rola')
    if isValidCnpj(input_):
        print('True')
    else:
        print('False')


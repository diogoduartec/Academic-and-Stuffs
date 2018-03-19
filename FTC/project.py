import re

## CONSTANTS VALUES
CPF_SIZE = 14
CNPJ_SIZE = 18


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
    multCnpj1 = [5,4,3,2,9,8,7,6,5,4,3,2]
    multCnpj2 = [6,5,4,3,2,9,8,7,6,5,4,3,2]
    if len(cnpj) != CNPJ_SIZE:
        return False

    cnpj = cnpj.replace('.','')
    cnpj = cnpj.replace('-','')
    cnpj = cnpj.replace('/','')

    ac = multSumArray(cnpj,(multCnpj1))
    if(getDigit(ac) != int(cnpj[12])):
        return False
    
    ac = multSumArray(cnpj, multCnpj2)
    if(getDigit(ac) != int(cnpj[13])):
        return False

    return True

def isValidRegex(note):
    cpf = note[0]
    cnpj = note[1]
    date = note[2]
    time = note[3]
    price = note[4]
    verification_code = note[5]
    
    if(not re.search(r'(\d{3}\.){2}\d{3}-\d{2}', cpf)):
        return False

    if(not re.search(r'\d{2}(\.\d{3}){2}/\d{4}-\d{2}', cnpj)):
        return False
    
    if(not re.search(r'\d{4}\.(1[0-2])|(0[1-9])\.([0-2][0-9])|(3[0-1])', date)): ## datetime without bisext or month validation
        return False
    
    if(not re.search(r'([0-1][0-9])|(2[0-4]):[0-5][0-9]:[0-5][0-9]', time)):
       return False
    
    if(not re.search(r'\[\d+\.\d{2}(,\d+\.\d{2})*\]', price)):##prices
        return False
    
    if(not re.search(r'\d{9}-(\w?){5}-(0|2|4|6|8){3}(-[0-1]{3})?', verification_code)):##prices
       return False
    
    return True


input_ = input()
note = input_.split(' ')
if(input_==''):
    print('True')
elif len(note)!= 6:
    print('False')
elif isValidRegex(note):
    if isValidCpf(note[0]) and isValidCnpj(note[1]):
        print('True')
    else:
        print('False')
else:
    print('False')
    

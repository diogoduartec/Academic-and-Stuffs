import re

## CONSTANTS VALUES
CPF_SIZE = 14
CNPJ_SIZE = 18
DATE_SIZE = 10
TIME_SIZE = 8
VERIFICATION_CODE_SIZE = 19

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

def isLeap(year):
    if year%4==0:
        if year%100!=0:
            return True
        elif year%400==0:
            return True;
        else:
            return False
    else:
        return False


##VALIDATION METHODS

def is31Month(month):
    if(month=='01' or month=='03' or month=='05' or month=='07' or month=='08' or month=='10' or month=='12'):
        return True
    else:
        return False

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

def isValidDate(date_):
    date = date_.split('.')
    year = date[0]
    month = date[1]
    day = date[2]
    
    if len(date_) != DATE_SIZE:
        return False

    if(day=='00' or month=='00'):
        return False

    if(isLeap(int(year)) and month=='02' and int(day)>29):
        return False;
    elif ((not isLeap(int(year))) and month=='02' and int(day)>28):
        return False
    if((not is31Month(month)) and int(day)>30):
        return False

    return True

def isNotRepeated(verification_code):
    aux = verification_code.split('-')
    string = aux[1]
    for i in range(len(string)):
         for j in range(len(string)):
             if(string[i]==string[j] and i!=j):
                 return False
    return True


def is101Valid(verification_code):
    if(len(verification_code)!=VERIFICATION_CODE_SIZE and(len(verification_code)>VERIFICATION_CODE_SIZE+4  or (not re.search(r'(-[0-1]{3})\b', verification_code)))):
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
    
    if(not (isValidDate(date) and re.search(r'/d{4}\.(0[1-9])|(1[0-2])\.(0[1-9])|([1-2][0-9])|(3[0-1])', date) and isValidDate(date))): ## datetime with leap or month validation
        return False
    
    if((not (re.search(r'(([0-1]\d)|(2[0-4])):[0-5][0-9]:[0-5][0-9]', time) and len(time)==TIME_SIZE))):
       return False
    
    if(not re.search(r'\[\d+\.\d{2}(,\d+\.\d{2})*\]', price)):##prices
        return False
    
    if(not (re.search(r'\d{9}-(\w?){5}-(0|2|4|6|8){3}((-[0-1]{3})?)', verification_code) and isNotRepeated(verification_code) and is101Valid(verification_code))):##verification code
       return False
    
    return True


try:
    input_ = input()
    note = input_.split(' ')
    if len(note)!= 6:
        print('False')
    elif isValidRegex(note):
        if isValidCpf(note[0]) and isValidCnpj(note[1]):
            print('True')
        else:
            print('False')
    else:
        print('False')
except EOFError:
    print('True')

tapeInput = ''
tapeNumberA = []
tapeNumberB = []
tapeResult = []
headInput = 1
headA = 25
headB = 25
headResult = 25
headOperator = 25

def initTapes():
	global tapeNumberA
	global tapeNumberB
	global tapeResult

	for i in range(100):
		tapeNumberA.append(' ')
		tapeNumberB.append(' ')
		tapeResult.append(' ')

def q4():
	#print('q4')

	return True
#carry 1#
def q3():
	#print('q3')

	global tapeResult
	global tapeNumberA
	global tapeNumberB
	global headA
	global headB
	global headResult

	if(tapeNumberA[headA] == ' ' and tapeNumberB[headB] == ' '):
		tapeResult[headResult] = '1'
		return q4()
	if(tapeNumberA[headA] == '1' and tapeNumberB[headB] == '1'):
		tapeResult[headResult] = '1'
		headA -= 1
		headB -= 1
		headResult -= 1
		return q3()
	if(tapeNumberA[headA] == '0'):
		tapeNumberA[headA] = '1'
	elif(tapeNumberB[headB] == '0'):
		tapeNumberB[headB] = '1'
	return q2()


#sum#
def q2():
	#print('q2')

	global tapeResult
	global tapeNumberA
	global tapeNumberB
	global headA
	global headB
	global headResult

	if(tapeNumberA[headA] == ' ' and tapeNumberB[headB] == ' '):
		return q4()
	if(tapeNumberA[headA] == '1' and tapeNumberB[headB] == '1'):
		tapeResult[headResult] = '0'
		headA -= 1
		headB -= 1
		headResult -= 1
		return q3()
	if(tapeNumberA[headA] == '1' and tapeNumberB[headB] == '0'):
		tapeResult[headResult] = '1'
	if(tapeNumberA[headA] == '0' and tapeNumberB[headB] == '1'):
		tapeResult[headResult] = '1'
	if(tapeNumberA[headA] == '0' and tapeNumberB[headB] == '0'):
		tapeResult[headResult] = '0'
	headA -= 1
	headB -= 1
	headResult -= 1
	return q2()

def qMoveHeads():
	global tapeNumberA
	global tapeNumberB
	global headA
	global headB

	if(tapeNumberA[headA]==' ' and tapeNumberB[headB]==' '):
		headA -= 1
		headB -= 1
		return q2()
	headB += 1
	headA += 1
	return qMoveHeads()

#correct the tapes so it is the same size #
def qCorrect():
	global tapeNumberA
	global tapeNumberB
	global headA
	global headB

	if(tapeNumberA[headA] == ' ' and tapeNumberB[headB] == ' '):
		return qMoveHeads()
	elif(tapeNumberA[headA] != ' ' and tapeNumberB[headB] == ' '):
		tapeNumberA[headA] = '0'
	elif(tapeNumberA[headA] == ' ' and tapeNumberB[headB] != ' '):
		tapeNumberB[headB] = '0'
	headA -= 1
	headB -= 1
	return qCorrect()

#writing tape of second number#
def q1():
	#print('q1')
	global tapeInput
	global tapeNumberA
	global tapeNumberB
	global headA
	global headB
	global headInput
	global headResult

	if(tapeInput[headInput] == ' '):
		headB += 1
		#headResult -= 1
		return qCorrect()
	elif(tapeInput[headInput] == '0'):
		tapeNumberB[headB] = '0'
	elif(tapeInput[headInput] == '1'):
		tapeNumberB[headB] = '1'
	else:
		return False
	headInput += 1
	headB -= 1
	#headResult += 1
	return q1()


#writing tape of first number#
def q0():
	#print('q0')
	global tapeInput
	global tapeNumberA
	global tapeNumberB
	global headA
	global headB
	global headInput

	if(tapeInput[headInput] == '+'):
		headA -= 1
		headB -= 1
		headInput += 1
		return q1()
	elif(tapeInput[headInput] == '0'):
		tapeNumberA[headA] = '0'
	elif(tapeInput[headInput] == '1'):
		tapeNumberA[headA] = '1'
	else:
		return False
	headInput += 1
	headA += 1
	headB += 1
	return q0()

initTapes()

tapeInput = input()
tapeInput = ' ' + tapeInput + ' '

if(q0()):
	out = str(tapeResult)
	print(tapeNumberA)
	print(tapeNumberB)
	print(out)
	out = out.replace(' ', '')
	out = out.replace(',', '')
	out = out.replace('\'', '')
	out = out.replace('[', '')
	out = out.replace(']', '')
	tapeInput = tapeInput.replace(' ', '')
	print(tapeInput+'='+out+' ACEITA')
else:
	tapeInput = tapeInput.replace(' ', '')
	print(tapeInput+' REJEITA')


a = str(tapeNumberA)
b = str(tapeNumberB)
r = str(tapeResult)

a = a.replace(' ', '')
a = a.replace(',', '')
a = a.replace('\'', '')
a = a.replace('[', '')
a = a.replace(']', '')

b = b.replace(' ', '')
b = b.replace(',', '')
b = b.replace('\'', '')
b = b.replace('[', '')
b = b.replace(']', '')

r = r.replace(' ', '')
r = r.replace(',', '')
r = r.replace('\'', '')
r = r.replace('[', '')
r = r.replace(']', '')

print(a)
print(b)
print(r)
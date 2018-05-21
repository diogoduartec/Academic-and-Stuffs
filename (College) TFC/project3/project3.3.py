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

#correct tape of number B, so it have same size that Number A#
def q7():
	#print('q7')

	global tapeNumberA
	global tapeNumberB
	global headA
	global headB

	if(tapeNumberA[headA] == ' '):
		return q2()
	
	tapeNumberB[headB] = '0'
	headB -= 1
	headA -= 1
	return q7()


def q6():
	#print('q6')
	return True

#carry 1#
def q5():
	#print('q5')

	global tapeNumberA
	global tapeNumberB
	global tapeResult
	global headA
	global headB
	global headResult

	if(tapeNumberA[headA] == ' ' and tapeNumberB[headB] == ' '):
		tapeResult[headResult] = '1'
		return q6()

	elif(tapeNumberA[headA] == '1' and tapeNumberB[headB] == '1'):
		tapeResult[headResult] = '1'
		headA -= 1
		headB -= 1
		headResult -= 1
		return q5()

	elif(tapeNumberA[headA] == '0' and tapeNumberB[headB] == '0'):
		tapeNumberA[headA] = '1'
	elif(tapeNumberA[headA] == '0' and tapeNumberB[headB] == '1'):
		tapeNumberA[headA] = '1'
	elif(tapeNumberA[headA] == '1' and tapeNumberB[headB] == '0'):
		tapeNumberB[headB] = '1'
	
	return q4()
#make sum#
def q4():
	#print('q4')

	global tapeNumberA
	global tapeNumberB
	global tapeResult
	global headA
	global headB
	global headResult

	if(tapeNumberA[headA] == '0' and tapeNumberB[headB] == '0'):
		tapeResult[headResult] = '0'
	elif(tapeNumberA[headA] == '0' and tapeNumberB[headB] == '1'):
		tapeResult[headResult] = '1'
	elif(tapeNumberA[headA] == '1' and tapeNumberB[headB] == '0'):
		tapeResult[headResult] = '1'
	elif(tapeNumberA[headA] == '1' and tapeNumberB[headB] == '1'):
		tapeResult[headResult] = '0'
		headA -= 1
		headB -= 1
		headResult -= 1
		return q5()
	else:
		return q6()
	headA -= 1
	headB -= 1
	headResult -= 1
	return q4()

#go to the end of tapes#
def q3():
	#print('q3')

	global tapeNumberA
	global tapeNumberB
	global tapeResult
	global headA
	global headB
	global headResult

	if(tapeNumberA[headA] == ' ' and tapeNumberB[headB] == ' '):
		headA -= 1
		headB -= 1
		return q4()
	headA += 1
	headB += 1
	return q3()


#write tape of second number#
def q2():
	#print('q2')

	global tapeInput
	global tapeNumberA
	global tapeNumberB
	global headInput
	global headA
	global headB

	if(tapeInput[headInput] == '+'):
		if(tapeNumberA[headA] == ' ' and tapeNumberB[headB] == ' '):
			headA += 1
			headB += 1
			return q3()
		elif(tapeNumberA[headA] != ' '):
			return q7()
	elif(tapeInput[headInput] == '1'):
		tapeNumberB[headB] = '1'
	elif(tapeInput[headInput] == '0'):
		tapeNumberB[headB] = '0'
	if(tapeNumberA[headA] == ' '):
		tapeNumberA[headA] = '0'

	headA -= 1
	headB -= 1
	headInput -= 1
	return q2()

#go to end of tape
def q1():
	#print('q1')

	global tapeInput
	global headInput

	if(tapeInput[headInput] == ' '):
		headInput-=1
		return q2()
	if(tapeInput[headInput] != '1' and tapeInput[headInput] != '0'):
		return False
	headInput += 1
	return q1()

#writing tape of first number#
def q0():
	#print('q0')
 
	global tapeInput
	global tapeNumberA
	global tapeNumberB
	global headInput
	global headA
	global headB

	if(tapeInput[headInput] == '+'):
		headInput += 1
		headA -= 1
		headB -= 1
		return q1()
	elif(tapeInput[headInput] == '1'):
		tapeNumberA[headA] = '1'
	elif(tapeInput[headInput] == '0'):
		tapeNumberA[headA] = '0'
	else:
		return False
	headA += 1
	headB += 1
	headInput += 1

	return q0()

initTapes()

tapeInput = input()
tapeInput = ' ' + tapeInput + ' '

if(q0()):
	out = str(tapeResult)
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

tapeInput = ''
tapeNumberA = ''
tapeNumberB = ''
tapeResult = ''
headInput = 0
headA = 0
headResult = 0
headOperator = 0;

def qSpecialAdd():
	if(tapeNumberA[headA]):
		seila muleke doido
		
def qAdd():
	if(tapeNumberA[headA] == '1' and tapeNumberB[headB] == '1'):
		return qSpecialAdd()
		
	if(tapeNumberA[headA] == '1' and tapeNumberB[headB] == '0'):
		tapeResult[headResult] = '1'
	if(tapeNumberA[headA] == '0' and tapeNumberB[headB] == '1'):
		tapeResult[headResult] = '1'
	if(tapeNumberA[headA] == '0' and tapeNumberB[headB] == '0'):
		tapeResult[headResult] = '0'
	if(tapeNumberA[headA] == '$' and tapeNumberB[headB] != '$'):
		return 0
	if(tapeNumberB[headA] == '$' and tapeNumberB[headB] != '$'):
		return 0
	if(tapeNumberA[headA] == '$' and tapeNumberB[headB] == '$'):
		return 1
	headA -= 1
	headB -= 1
	headResult -= 1
	return qAdd()

def qDecision():##operation decision
	if(tapeInput[headOperator] == '+'):
		return qAdd()
	if(tapeInput[headOperator] == '-'):
		return qSub()
	return 0

def q1():##store in tapeNumberB
	if(tapeInput[headInput] == '1' or tapeInput[headInput] == '0'):
		tapeNumberB[headB] = tapeInput[headInput];
		headInput += 1;
		headB += 1;
		return q1()
	else:
		headB = 0
		headInput = 0
		return qDecision()

def qStart():##store in tapeNumberA
	if(tapeInput[headInput] == '1' or tapeInput[headInput] == '0'):
		tapeNumberA[headA] = tapeInput[headInput];
		headInput += 1;
		headA += 1
		return qStart()
	else:
		headA = 0
		headOperator = headInput
		return q1()
	

tapeInput = input()

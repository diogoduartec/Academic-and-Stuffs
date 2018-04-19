def initMatrix(lines, columns):##OK
	result = []
	for i in range(lines):
		line = []
		for j in range(columns):
			line.append(0)
		result.append(line)
	return result
        
def makeTransposedMatrix(matrix):##OK
	result = initMatrix(len(matrix[0]), len(matrix))
	for line in range(len(matrix)):
		for column in range(len(matrix[line])):
			result[column][line] = matrix[line][column]
	return result

def matrixMultiplication(matrixA, matrixB):##OK
	matrixB = makeTransposedMatrix(matrixB)
	matrixProduct = []
	for k in range(len(matrixA)):
		line = []
		for i in range(len(matrixA)):
			ans = 0
			for j in range(len(matrixA[i])):
				ans += matrixA[k][j]*matrixB[i][j]
			line.append(ans)
		matrixProduct.append(line)
	return matrixProduct

def makePi(states, qi):##OK
	result = initMatrix(states, 1)
	result[qi] = [1]
	return result

def makeEta(states, acceptStates):##OK
	result = initMatrix(states, 1)
	for i in acceptStates:
		result[i] = [1]

	return result

def makeTransitionMatrix(delta, a, states):##OK
	if a == 'a':
		column = 0
	else:
		column = 1

	result = initMatrix(states, 2)
	
	for line in range(len(delta)):
		result[line][delta[line][column]] = 1 ## SETANDO OS BITS DA TRANSIÇÃO!!!!

	return result

altomata = input()


automata = ast.literal_eval(input())
n = int(input())
for i in range(n):
	word = input()
	xA = makeTransitionMatrix(automata['delta'], 'a', automata['estados'])
	xB = makeTransitionMatrix(automata['delta'], 'b', automata['estados'])
	piT = makeTransposedMatrix(makePi(automata['estados']), automata['inicial'])
	eta = makeEta(automata['estados'], automata['final'])

def getURILink(code):
	return 'https://www.urionlinejudge.com.br/judge/en/problems/view/'+code

def getGitHubLink(category, language, code):
	result = 'https://github.com/diogoduartec/Competitive-Programming/blob/master/Online_Judge-Solutions/URI/'+category.lower()+'/'
	if(language == 'Java'):
		result += category+'_'+code+'.java'
	elif language == 'C++':
		result += code+'.cpp'
	elif language == 'Python':
		result += code+'.py'
	return result

def problemTuple(problem):
	result =  str('|   '+problem['category']+'   | ['+problem['code']+']('+getURILink(problem['code'])+')   | '+problem['name']+'       |   ['+problem['language']+']('+getGitHubLink(problem['category'], problem['language'], problem['code'])+')     |')
	return result

def lineToInsert(text, problem):
	for line in text:
		if(line.find(problem['category']) != -1):

def addProblem(readmePath, problem)
	readme = open(readmePath, 'r+')
	text = readme.readlines()
def getURILink(code):
	return 'https://www.urionlinejudge.com.br/judge/en/problems/view/'+code

def getGitHubLink(category, language, code):
	result = 'https://github.com/diogoduartec/Competitive-Programming/blob/master/Online_Judge-Solutions/URI/'+category+'/'
	if(language == 'Java'):
		result += category+'_'+code+'.java'
	elif language == "C++":
		result += code+'.cpp'
	elif language == 'Python':
		result += code+'.py'

def getLine(category, code, name, language):
	result =  str('|   '+category+'   | ['+code+']('+getURILink(code)+')   | '+name+'       |   ['+language+']('+getGitHubLink(category, language, code)+')     |')
	return result
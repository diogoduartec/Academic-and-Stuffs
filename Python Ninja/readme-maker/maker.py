input_ = input()

from utilities import getLine
problem = input_.split(' - ')

category = problem[0]
code = problem[1]
name = problem[2]
language = problem[3]

print(getLine(category, code, name, language))
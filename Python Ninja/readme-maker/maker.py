input_ = input()

from utilities import problemTuple
problem = input_.split(' - ')

category = problem[0]
code = problem[1]
name = problem[2]
language = problem[3]

problem = {'category':category, 'code':code, 'name':name, 'language':language}

print(problemTuple(problem))
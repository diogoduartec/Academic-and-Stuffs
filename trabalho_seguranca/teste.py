from idea import IDEA

idea = IDEA()

key = idea.get_serialized_key()
print(key)
idea.set_key(key)
print(idea.get_key())

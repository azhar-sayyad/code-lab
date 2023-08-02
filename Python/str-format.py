age = 22
name = 'Azhar'

print('{0} was {1} years old when he wrote this book'.format(name, age))
print('Why is {0} playing with that python?'.format(name))

print(name+' is '+str(age)+' years old')

print('{} is {} years old'.format(name,age))
print('{name} is {age} years old'.format(name=name,age=age))

print('{name} is {age} years old')
print(f'{name} is {age} years old')

# decimal (.) precision of 3 for float '0.333'
print('{0:.3f}'.format(1.0/3))
# fill with underscores (_) with the text centered
# (^) to 11 width '___hello___'
print('{0:_^11}'.format('hello'))
# keyword-based 'Swaroop wrote A Byte of Python'
print('{name} wrote {book}'.format(name='Nobita', book='A Byte of Python'))

print('a', end=' ')
print('b', end=' ')
print('c')


print('This is the first line\nThis is the second line')

print("This is the first sentence. \
This is the second sentence.")

print(r"Newlines are indicated by \n")
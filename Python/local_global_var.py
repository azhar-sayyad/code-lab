x = 50

def fun(x):

    print('x is ',x)

    x = 10

    print('change local x ',x)

fun(x)

print('x is still ',x)

print('#################')


y = 50

def func():

    global y 

    print('y is ',y)

    y = 2

    print('changed global y ',y)

func()

print('value of y is ',y)
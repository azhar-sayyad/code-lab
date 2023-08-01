def hello():
    print('Hello Function')

hello()
hello()

for i in range(0,5):
    hello()

def print_max(a,b):
    if(a>b):
        return 'a is maximum'
    elif(a == b):
        return 'equal'
    else:
        return 'b is maximun'

a = 10
b = 20
    
print_max(a,b)

print(print_max(50,100))



def massage(massage, time =1):
    print(massage * time)

massage('Hello')
massage('hello ',5)
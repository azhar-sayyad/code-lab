
num1 = int(input("enter 1st no\t"))
num2 = int(input("enter 2nd no\t"))
oper = input("enter your choice \n +\t-\t*\t/\t")

if num1 == 45 and num2 == 3 and oper == '*':
    print("555")
elif num1 == 56 and num2 == 9 and oper == '+':
    print("77")
elif num1 == 56 and num2 == 6 and oper == '/':
    print("4")

elif oper == '+':
    print(num1 ,"+",num2,"=",num1 + num2)
elif oper == '-':
    print(num1 ,"-",num2,"=",num1 - num2)
elif oper == '*':
    print(num1 ,"*",num2,"=",num1 * num2)
elif oper == '/':
    print(num1 ,"/",num2,"=",num1 / num2)
else:
    print("Error! check your input")
input("press any key to Exit")
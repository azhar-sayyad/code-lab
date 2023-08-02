

print("\tEnter first number\t\tEnter Operator\t\tEnter second number\t\tResult\t")
print("\t\t\t\t\t\t\t (+ - * / %)")
while(1):
    num1 = int(input("\t\t"))
    operator = input("\t\t")
    num2 = int(input("\t\t"))
    if operator == "+":
        print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t",num1+num2)
        
    elif operator == "-":
        print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t",num1-num2)
    elif operator == "*":
        print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t",num1*num2)
    elif operator == "/":
        print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t",num1/num2)
    elif operator == "%":
        print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t",num1%num2)
    else:
        print("Error! enter correct input")

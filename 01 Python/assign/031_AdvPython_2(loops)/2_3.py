#Q3
num1 = int(input("enter first number - "))
num2 = int(input("enter second number - "))
while num2>0:
    num1,num2 = num2,num1%num2
print("GCD - ",num1)
    

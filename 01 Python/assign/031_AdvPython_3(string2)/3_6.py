#Q6
def factorial(num):
    if num==0 or num==1:
        return 1
    return num*factorial(num-1)

num = 20
for i in range(1,num+1):
    fact = factorial(i)
    print(i," ",fact)
    
    

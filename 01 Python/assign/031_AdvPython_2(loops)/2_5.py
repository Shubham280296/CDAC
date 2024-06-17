#Q5
num = int(input("Enter a number - "))
sumdigit = 0
nodigit = 0
while num>0:
    sumdigit += num%10
    nodigit += 1
    num = num//10
print(f"no of digits - {nodigit}\nsum of digits - {sumdigit}")
    

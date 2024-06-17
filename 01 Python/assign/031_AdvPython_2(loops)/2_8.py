#Q8
num = int(input("enter the number of terms in series 9,99,999..."))
add = 0
for i in range(num):
    digitbase=0
    for j in range(i+1):
        digitbase += 10**j
    number = digitbase*9
    print(number,end=" ")
    add += number
print("sum of all numbers in series-",add)
        
        

#Q9
def fact(i):
    if  i == 1 or i== 0:
        return 1
    return i*fact(i-1)
val = int(input("enter the value of x - "))
terms = int(input("enter the number of terms - "))
add = 0
for i in range(terms):
    add = add + (val**i)/fact(i)
print ("sum of {terms} terms in series - %6f"%add)
    

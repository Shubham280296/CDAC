val = int(input("enter the value of x - "))
terms = int(input("enter the number of terms - "))
add = 0
for i in range(terms):
    b =-abs((i%2)-0.5)/((i%2)-0.5)  #determines sign of terms odd(1st,3rd..) - positive, even(2nd,4th..) - negative 
    num = int(b*val**(2*i+1))
    print (num)
    add+=num
print (f"sum of {terms} terms in series - {add}")
    

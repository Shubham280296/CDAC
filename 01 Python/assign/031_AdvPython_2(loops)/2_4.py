#Q4
addition = 0
numbers = 0
product = 1
while((num:=input("Enter number "))!='q'):
    addition = addition + int(num)
    numbers += 1
    product = product*int(num)
print (f"average - {addition/numbers}\nproduct - {product}")

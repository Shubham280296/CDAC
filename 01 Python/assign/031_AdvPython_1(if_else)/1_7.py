#Q7
unit = int(input("Ënter number of unit - "))
bill=0
while unit>100:
    if unit>200:
        bill = bill+(unit-200)*10
        unit = 200
    else:
        bill = bill+(unit-100)*5
        unit = 100
print ("total bill amount - Rs",bill)

#Q2
amount = int(input("ënter the amount - "))
a = [2000,500,100,50,10,5,2,1] # denomination
b = ['note','coin']
i=0
while amount != 0:
    if(note:=amount//a[i])!=0:  # if ammount less than denomination go to next denomination
        if a[i] <10:
            print(f"{a[i]} - {note} {b[1]}")
        else:
            print(f"{a[i]} - {note} {b[0]}")

        amount = amount%a[i]  # remaining amount using smaller denomination
    i+=1

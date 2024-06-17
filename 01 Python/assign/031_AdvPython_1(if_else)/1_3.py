#Q3
totaldays = int(input("Enter number of classes held - "))
attendeddays = int(input("Enter number of classes attended - "))
medicalcause = (input("Medical cause 'Y' or 'N' - "))
percentage = attendeddays*100/totaldays
print("Percentage of attendance:",percentage)
if percentage>=75 or medicalcause =='Y' :
    print("Student is allowed to sit in exam")
else:
    print("Student is  not allowed to sit in exam")


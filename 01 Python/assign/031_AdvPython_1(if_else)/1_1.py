#Q1
totaldays = int(input("Enter number of classes held - "))
attendeddays = int(input("Enter number of classes attended - "))
percentage = attendeddays*100/totaldays
print("Percentage of attendance : ",percentage)
if percentage>=75:
    print("Student is allowed to sit in exam")
else:
    print("Student is  not allowed to sit in exam")


        

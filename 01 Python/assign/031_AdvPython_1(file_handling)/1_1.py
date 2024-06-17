#Q1
import re
with open("phonenumb.txt") as fl1:
    print("phonenumb")
    for mobilenumber in fl1:
        m= re.search("(^\d{10}$)",mobilenumber)
        if m!=None:
            print("Validated mobile number is : ",m)
        else:
            print("invalid mobile number")

#Q3
import re

mobilenumber = input("Enter mobile number - ")
m= re.search("(^\d{10}$)",mobilenumber)
if m!=None:
    print("Validated mobile number is : ",m)
else:
    print("invalid mobile number")
          

#Q1
import re

Emailid = input("Enter Email Id - ")
m= re.search("(\w.*?@)",Emailid,re.I)
if m!=None:
    print((m.group(1)).strip("@"))
else:
    print("invalid Email Id")
          

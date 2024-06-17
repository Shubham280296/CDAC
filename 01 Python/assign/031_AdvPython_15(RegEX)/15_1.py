#Q1
import re
dict1 = {"found":[],"not found":[]}
str1 = input("Enter lines - ").split(".")
for l in str1:
    m1 = re.search(".*m$|mid$",l,re.I)
    if  (m1!=None):
        dict1["found"].append(l)
    else:
        dict1["not found"].append(l)
print(dict1)          

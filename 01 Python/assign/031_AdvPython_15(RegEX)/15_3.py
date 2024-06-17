#Q3
import re
patt1 = input("enter pattern 1 - ")
patt2 = input("enter pattern 2 - ")

list1= []
list2= []

string = input("Enter string - ").split(".")

for ln in string:
    if re.search(patt1,ln)!=None:
        list1.append(ln)
    if re.search(patt2,ln)!=None:
        list2.append(ln)        
print("list1 - ",list1)    
print("list2 - ",list2)      
"""enter pattern 1 - ^\w+$
enter pattern 2 - ^\W+$
Enter string - jhfwefkwehg.$%*^#%$$^&*^*%^#$$.GHFJHH%$%^&*
"""

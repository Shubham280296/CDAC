#Q4
import re
attempt =0
while attempt<3:
    username = input("Enter the username")
    password = input("Enter the password")
    l = len(password)
    m1 = re.search("^[a-zA-Z0-9]+$",username)
    m2 = re.search("^[a-zA-Z].*[#,@].*",password)
    if ((m1!=None)and(m2!=None)and(l==8)):
        print("welcome to our application")
        break
    print("Reenter username and password")
    attempt+=1
    

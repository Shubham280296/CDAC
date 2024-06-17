#Q2
import re
d={}
with open("productdata.txt") as fl1:
    with open("myproduct.txt","w") as fl2:
        for ln in fl1:
            m = re.search("^12.*0$",ln,re.I)
            m1 = re.search(".*:([a-zA-Z]+):(\d+)$",ln,re.I)
            if m!=None:
                fl2.write(ln)
            if m1!=None:
                if d.get(m1.group(1),-1)==-1:
                    d[m1.group(1)]=m1.group(2)
                else:
                    d[m1.group(1)]=int(m1.group(2))+int(d.get(m1.group(1)))

for key,value in d.items():
    print(key,"-->",value)
            

cat = input("Enter the category ")
with open("productdata.txt") as fl1:
    for ln in fl1:
        print(ln)
        m2 = re.search(".*?:([a-zA-Z ]+):.*:"+cat+":.*",ln,re.I)
        if m2!=None:
            print(m2.group(1), cat)
        else:
            print("not found")
    

    
    

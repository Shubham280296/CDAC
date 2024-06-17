#Q2
import re

list1= input("enter the data - ").split(".")
movpune = []
for l in list1:
    m = re.search(".*?\W*([a-zA-Z]+?[a-zA-Z])\W.*?(\d{4}).*([a-zA-Z]{4})$",l)
    if '2018'==m.group(2):
        print(f"{m.group(1)},{m.group(2)}")
    if 'pune'==m.group(3):
        movpune.append(m.group(1))
print("movies released in pune : ",movpune)
#12,queen,2018,kangana,1234562018,pune.15,dangal,2018,aamir,34562562018,mumbai.12,sholay,1995,amitabh,7869272018,pune


    

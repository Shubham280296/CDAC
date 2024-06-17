#regular expression demo
import re
s = "Something is there somewhere"
m = re.search("s.*e",s,re.I)
if m!=None:
    print(m.span())
    print(m.group())
else:
    print("note found")
        
m = re.search("s.*?e",s,re.I)
if m!=None:
    print(m.span())
    print(m.group())
else:
    print("note found")
        
m = re.search("t.*?e",s,re.I)
if m!=None:
    print(m.span())
    print(m.group())
else:
    print("note found")

m = re.match("t.*?e",s,re.I)
if m!=None:
    print(m.span())
    print(m.group())
else:
    print("not found")

m = re.search("^\w+\s\w+\s\w+\s\w+$",s,re.I)
if m!=None:
    print(m.span())
    print(m.group())
else:
    print("not found")

myreg = re.compile("s.*e?",re.I)
m = myreg.search(s)
if m!=None:
    print(m.span())
    print(m.group())
else:
    print("not found")

new = re.sub("s.*?e","any",s,flags = re.I)
print(new)

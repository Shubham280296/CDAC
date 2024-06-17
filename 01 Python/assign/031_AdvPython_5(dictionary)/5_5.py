#Q5
sampleDict={'a': 100, 'b': 200, 'c': 300, 'd':200}
list1=[]
for key,value in sampleDict.items():
    if (value==200):
        list1.append(key)

print(list1)

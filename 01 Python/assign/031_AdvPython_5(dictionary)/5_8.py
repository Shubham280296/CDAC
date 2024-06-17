#Q8
sampleDict = {
 'emp1': {'name': 'Jhon', 'salary': 7500},
 'emp2': {'name': 'Emma', 'salary': 8000},
 'emp3': {'name': 'Brad', 'salary': 6500}
}
name1 = input("enter the name - ")
nsalary = int(input("enter the new salary - "))

for key1 in sampleDict.keys():
    if (sampleDict[key1]['name'] == name1):
        if (nsalary>sampleDict[key1]['salary']):
            sampleDict[key1]['salary']=nsalary
            break
        else:
            print("wrong salary")
            break
else:
    print("name not found")
print(sampleDict)                
     

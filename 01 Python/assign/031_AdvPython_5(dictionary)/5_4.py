#Q4
sampleDict = {
 "name": "Kelly",
 "age":25,
 "salary": 8000,
 "city": "New york"
 }
keysToRemove = ["name", "salary"]

for i in keysToRemove:
    sampleDict.pop(i,-1)

print(sampleDict)

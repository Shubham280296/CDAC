#Q4
list1 = ["Hello","Welcome"]
list2 = ["Students","Sir"]
list3 =[]
for i in range(len(list2)):
    for j in range(len(list1)):
        list3.append(list1[j]+" "+list2[i])
print(list3)

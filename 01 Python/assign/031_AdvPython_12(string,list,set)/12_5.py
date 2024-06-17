#Q5
lst=[12, 1, 3, 7, 8, 5, 8]
size = max(lst)
list1 = []
for i in range(size+1):
    list1.append(-1)
j=0
for i in lst:
    list1[i]=j
    j+=1
print(list1)   


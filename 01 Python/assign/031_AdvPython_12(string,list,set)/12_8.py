#Q8
list1 = []
while ((str1:=input("Enter the number - "))!=-1):
    length = len(list1)
    i=0
    k=0
    while (i<length):
        if (list1[i][1]==str1[1]):
            k = i+1
        i+=1
    if (not(k==0)):       
        list1.insert(k,str1)
    else:
        list1.append(str1)
    print(list1)

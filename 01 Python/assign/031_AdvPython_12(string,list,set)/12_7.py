#Q7
list1 = []
list1.append([])
while ((num := int(input("Enter the number - ")))!=-1):
    while ((num%10)>=len(list1)):
        list1.append([])
    list1[num%10].append(num)
    print(list1)
        

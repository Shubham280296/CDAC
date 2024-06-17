#Q2
str1=input("Enter the string - ")
str2=input("Enter the string to search - ")
length = len(str2)
i = j = 0
while i<(len(str1)-length):
    if str1[i:i+length]==str2:
        print(str2,"-",i)
        j+=1
    i+=1

print("count = ",j)
    
    

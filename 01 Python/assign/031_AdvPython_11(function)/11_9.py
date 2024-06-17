#Q9
def filter_long_word(list1,n):
    for sublist in list1:
        if len(sublist)>=n:
            list2.append(sublist)
            print(sublist) 

list1 = input("enter list of words - ").split()
n = int(input("Enter the minimum length of filtered words"))
list2 = []
filter_long_word(list1,n)
print("Filtered words with length greater than ",n," - ",list2)    

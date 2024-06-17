#Q8
def find_longest_word(list1):
    long = list1[0]
    for sublist in list1[1:]:
        if len(sublist)>len(long):
            long = sublist
        print(long)
    return long 

list1 = input("enter list of words - ").split()

long = find_longest_word(list1)
print("Longest word in list is",long)    

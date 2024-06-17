#Q7
def overlapping(list1,list2):
    for sublist in list1:
        if sublist in list2:
            print(sublist)
            return True
    return False

list1 = input("enter first list of words - ").split()
list2 = input("enter second list of words - ").split()

ans = overlapping(list1,list2)
if ans:
    print("Lists are overlapping")
else:
    print("Lists are not overlapping")    

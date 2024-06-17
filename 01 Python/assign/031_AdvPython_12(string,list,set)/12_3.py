#Q3
list1 = [10,30,25,8,100,50]

# Add Data  at last position

def adddata(l1):
    list1.append(l1)
        
# Add Data at given position
def addposdata(l1,pos):
    list1.insert(pos,l1)
    
#delete by value
def deletebyvalue(value):
    if value in list1:
        ans=input(f" do you want to delete {value}(y/n)?")
        if ans=="y":
            list1.remove(value)
            return 1
        else:
            return 2
    else:
        return 3
#delete data by position
def deletedata(pos=-1):#default last data
    list1.pop(pos)
                  
#to sort data
def sortdata(flag = False):
    list1.sort(reverse = flag)

#to reverse data
def reversedata():
    list1.reverse()

#sort order without changing original list
def sortnochangedata():
    global list2
    list2 = sorted(list1)    

#reverse order without changing original list
def reversenochangedata():
    global list2
    list2 = list(reversed(list1))

#Display data
def displaydata():
    print(list1)

#Display numbered data
def displaynumbereddata():
    j=1
    for i in list1:
        print(f"{j} - {i}")
        j+=1
        
list2 = []        
choice=0
while choice!=9:
    choice=int(input("""
1. Accept Data
2. Delete data by value
3. delete data by position
4. sort 
5. reverse
6. Print in sorted order without changing original list
7. print in reverse order without changing original list
8. display data

choice: """))
    match choice:
        case 1:
            subchoise = input("""
a) add at last position
b) add at given position
choice: """)
            if subchoise == "a":
                l1=int(input("enter data"))
                adddata(l1)
            else:
                l1=int(input("enter data"))
                pos=int(input("enetr position"))                
                addposdata(l1,pos)         
        case 2:
            l1=int(input("enter value to delete"))
            status=deletebyvalue(l1)
            if status==1:
                print("found and deleted")
            elif status==2:
                print("found and not deleted")
            else:
                print("not found")
        case 3:
            subchoise = input("""
a) delete last element
b) delete from particular position
choice: """)
            if subchoise == "a":
                deletedata()
            else:
                pos=int(input("enetr position"))                
                deletedata(pos) 
        case 4:
            subchoise = input("""
a) ascending
b) descending
choice: """)
            if subchoise == "a":
                sortdata()
            else:               
                sortdata(True)
        case 5:
            reversedata()             
        case 6:
            sortnochangedata()
            print(list2)
        case 7:
            reversenochangedata()
            print(list2)
        case 8:
            subchoise = input("""
a) normal
b) numbered
choice: """)
            if subchoise == "a":
                displaydata()                             
            else:
                displaynumbereddata() 
                
        case 9:
            print("Thank you for visiting...")
        case _:
            print("wrong choice")
            pass

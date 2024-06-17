#Q3

# Delete element 
def delement(set1,s1):
    set1.discard(s1)

# add a elemet
def addelement(set1,s1):
    set1.add(s1)
           
#create one more set
def creatset(tuple1):
    global set2
    set2 = set(tuple1)
        
# union of 2 sets
def uni(set1,set2):
    global set3
    set3 = set1.union(set2)    
                  
#intersection of 2 sets
def inter(set1,set2):
    global set3
    set3 = set1.intersection(set2) 

#difference of 2 sets
def diff(set1,set2):
    global set3
    set3 = set1.difference(set2)
    
#convert set into frozenset
def frozen(set1):
    global set3
    set3 = frozenset(set1)    



set1 = set((input("Enter the elements of set - ")).split())       
set2 = set()
set3 = set()
choice=0
while choice!=8:
    choice=int(input("""
1. delete element
2. add a elemet
3. create one more set
4. union of 2 sets
5. intersection of 2 sets
6. difference of 2 sets
7. convert set into frozenset
8. exit
choice: """))
    match choice:
        case 1:
            s1=input("enter element to delete - ")
            delement(set1,s1)
                    
        case 2:
            s1=input("enter element to add - ")
            addelement(set1,s1)
            
        case 3:
            tuple1 = tuple((input("Enter the elements of set - ")).split())
            creatset(tuple1)
            
        case 4:   
            uni(set1,set2)
  
        case 5:
            pass
            inter(set1,set2)
            
        case 6:
            pass
            diff(set1,set2)

        case 7:
            pass
            frozen(set1)
                
        case 8:
            print("Thank you for visiting...")
        case _:
            print("wrong choice")
            pass
    print(set1,"\n",set2,"\n",set3)

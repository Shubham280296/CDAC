
from ClassdemoPerson import *

emplst=[SalEmp("Rajan","design","game designer",400000),
        ContractEmp("Revati","design","UX designer",50,7000),
        SalEmp("Atharva","Admin","CEO",4100000)]

#accept data and add new employee in the list
def addnewemployee(ch):
    nm=input("enter name")
    dept=input("enter department")
    desg=input("enetr designation")
    if ch==1:
        sal=float(input("enetr salary"))
        e=SalEmp(nm,dept,desg,sal)
    elif ch==2:
        hrs=int(input("enter hours"))
        hrcharges=float(input("enter hourly charges"))
        e=ContractEmp(nm,dept,desg,hrs,hrcharges)
    else:
        numemp=int(input("enter number of employees"))
        charges=float(input("enter charges"))
        e=ContractEmp(nm,dept,desg,numemp,charges)
    emplst.append(e)

#display all employees
def displayall():
    for ob in emplst:
        print(ob)
        
#seach emplyee by id
def findById(pid):
    for ind,ob in enumerate(emplst):
        if ob.get_pid()==pid:
            return ind,ob
    return -1,None
     
def deleteById(pid):
    ind,e=findById(pid) 
    if e!=None:
        ans=input(f"{e.get_pid()} {e.get_pname()} do you want to delete?(y/n)")
        if ans=="y":
            emplst.pop(ind) 
            return 1
        else:
            return 2
    else:
        return 3
    
def updateById(pid,sal):
    pos,e=findById(pid)
    if e!=None:
        ans=input(f"{e.get_pid()} {e.get_pname()} do you want to update")
        if ans=="y":
            if isinstance(e, SalEmp):
                e.set_sal(sal)
            elif isinstance(e,ContractEmp):
                e.set_hrcharges(sal)
            elif isinstance(e,VendorEmp):
                e.set_charges(sal)
            return 1
        else:
            return 2
    else:
        return 3

def calculatesalarydetails(pid):
    pos,e=findById(pid)
    if e!=None:
        return e.calcsal()
    else:
        return -1
    
choice=0
while choice!=7:
    choice=int(input("""1. add new employee
                     2. delete by id
                     3. update by id
                     4. display all
                     5. display By id
                     6. calculate salary
                     7. exit"""))
    match choice:
        case 1:
            ch=int(input("1. Salararied\n2. Contract\n 3. vendor\n"))
            addnewemployee(ch)
        case 2:
            pid=input("enetr id")
            status=deleteById(pid)
            if status==1:
                print("found and deleted")
            elif status==2:
                print("found but not deleted")
            else:
                print("not found")
        case 3:
            pid=pid=input("enetr id")
            sal=float(input("enetr salary"))
            status=updateById(pid,sal)
            
            if status==1:
                print("found and updated")
            elif status==2:
                print("found but not updated")
            else:
                print("not found")
        case 4:
            displayall()
        case 5:
            pid=input("enetr id")
            pos,e=findById(pid)
            if e!=None:
                print(e)
            else:
                print("Not found====>",pid)
        case 6:
            pid=input("enetr id")
            sal=calculatesalarydetails(pid)
            if sal!=-1:
                print("Salary : ",sal)
            else:
                print("not found")
        case 7:
            print("Thank you for visiting")
        case _:
            print("wrong choice")
        


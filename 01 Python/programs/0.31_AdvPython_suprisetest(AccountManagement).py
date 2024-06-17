# prn - 031, 029

from abc import ABC,abstractclassmethod
class Account:
    cnt= 1        
    def __init__(self,name = '',balance=0,pin=0):
        self.__aid = Account.cnt
        Account.cnt+=1
        self.__name = name
        self._balance = balance
        self.__pin = pin
        
    def get_aid(self):
        return self.__aid
    
    def set_name(self,name):
        self.__name = name
    
    def get_name(self):
        return self.__pname

    def set_balance(self,balance):
        self._balance = balance
    
    def get_balance(self):
        return self._balance
    
    def set_pin(self,pin):
        self.__pin = pin
    
    def get_pin(self):
        return self.__pin

    @abstractclassmethod
    def withdraw(self,Amount=0):
        pass
        
    def __str__(self):
        return f"ID : {self.__aid}  Name : {self.__name} Balance : {self._balance}"
    
class Saving(Account):
    intrate_s=0.05
    minbal_s = 10000
    def __init__(self,name = '',balance=0,pin=0,ECS=0):
        Account.__init__(self,name,balance,pin)
        self.__ECS = ECS

    def set_ECS(self,ECS):
        self.__ECS = ECS
     
    def get_ECS(self):
        return self.__ECS
     
    def withdraw(self,amount=0):
        if ((self._balance-amount)>Saving.minbal_s):
            return True
     
    def __str__(self):
        return Account.__str__(self)+ f"\tECS: {self.__ECS}  Interest Rate : {Saving.intrate_s} Minimum Balance : {Saving.minbal_s}"

class Current(Account):
    intrate_c=0.01
    minbal_c = 1000
    def __init__(self,name = '',balance=0,pin=0,notrans=0):
        Account.__init__(self,name,balance,pin)
        self.__notrans = notrans

    def set_notrans(self,notrans):
        self.__notrans = notrans
     
    def get_notrans(self):
        return self.__notrans
     
    def withdraw(self,amount=0):
        if ((self._balance-amount)>Current.minbal_c):
            return True
     
    def __str__(self):
        return Account.__str__(self)+ f"\tNo of transaction: {self.__notrans}  Interest Rate : {Current.intrate_c} Minimum Balance : {Current.minbal_c}"

class Demat(Account):
    intrate_d=0.005
    minbal_d = 100000
    def __init__(self,name = '',balance=0,pin=0,commision=0):
        Account.__init__(self,name,balance,pin)
        self.__commision = commision

    def set_commision(self,commision):
        self.__commision = commision
     
    def get_commision(self):
        return self.__commision
     
    def withdraw(self,amount=0):
        if ((self._balance-amount)>Demat.minbal_d):
            return True
     
    def __str__(self):
        return Account.__str__(self)+ f"\tCommission: {self.__commision}  Interest Rate : {Demat.intrate_d} Minimum Balance : {Demat.minbal_d}"


acclst=[Saving("Rajan",256565,123456,2000),
        Current("Revati",1025462,987654,5),
        Demat("Atharva",501545,548620,0.02)]

#add new account
def addnewaccount(ch):
    name=input("enter name")
    balance=float(input("enter starting balance"))
    pin=int(input("enter pin"))
    if ch==1:
        if balance > Saving.minbal_s:
            ecs=float(input("ECS"))
            e=Saving(name,balance,pin,ecs)
            acclst.append(e)
        else:
            print("insufficient balance")
    elif ch==2:
        if balance > Current.minbal_c:
            notrans=int(input("enter min no of transaction per day"))
            e=Current(name,balance,pin,notrans)
            acclst.append(e)
        else:
            print("insufficient balance")
    else:
        if balance > Demat.minbal_d:
            commission=float(input("enter commission"))
            e=Demat(name,balance,pin,commission)
            acclst.append(e)
        else:
            print("insufficient balance")
    

#get account
def getaccount(aid,pin):
    for ind,ob in enumerate(acclst):
        if ((ob.get_aid()==aid)and(ob.get_pin()==pin)):
            return ind,ob
    else:
        return -1,None

        
#withdraw amount
def withdraw(aid,pin,amount):
    ind,e = getaccount(aid,pin)
    if e!=None:
        if e.withdraw(amount):
            e.set_balance(e.get_balance()-amount)
            return 1
        else:
            return 2
    else:
        return 3

#deposit amount     
def deposit(aid,pin,amount):
    ind,e = getaccount(aid,pin)
    if e!=None:
        e.set_balance(e.get_balance()+amount)
        return 1
    else:
        return 2
    
#change pin
def changepin(aid,pin,newpin):
    ind,e = getaccount(aid,pin)
    if e!=None:
        e.set_pin(newpin)
        return 1
    else:
        return 2

#check balance
def closeaccount(aid,pin):
    ind,e = getaccount(aid,pin)
    if e!=None:
        ch = input(f"{e} Do you want to close account(y,n)?")
        if ch=='y':
            acclst.pop(ind)
            return 1
        else:
            return 2       
    else:
        return 3

#close account
def checkbalance(aid,pin):
    ind,e = getaccount(aid,pin)
    if e!=None:
        return e.get_balance()
    else:
        return None

    
choice=0
while choice!=7:
    for i in acclst:
        print(i) 
    choice=int(input("""
                     1. add new account
                     2. withdraw
                     3. deposite
                     4. change pin
                     5. check balance
                     6. close account
                     7. exit
                     """))
    match choice:
        case 1:
            ch=int(input("1. Saving\n2. Current\n 3. Demat\n"))
            addnewaccount(ch)
        case 2:
            aid=int(input("enter id"))
            pin=int(input("enter pin"))
            amount=float(input("enter amount to be withdrawn"))
            status=withdraw(aid,pin,amount)
            if status==1:
                print("ammount withdrawn",amount)
            elif status==2:
                print("balnce not sufficient ")
            else:
                print("account not found")
        case 3:
            aid=int(input("enter id"))
            pin=int(input("enter pin"))
            amount=float(input("enter amount to be deposited"))
            status=deposit(aid,pin,amount)
            if status==1:
                print("ammount deposited",amount)
            else:
                print("account not found")
        case 4:
            aid=int(input("enter id"))
            pin=int(input("enter pin"))
            newpin=float(input("enter new pin"))
            status=changepin(aid,pin,newpin)
            if status==1:
                print("Pin Changed")
            else:
                print("invalid credentials")
        case 5:
            aid=int(input("enter id"))
            pin=int(input("enter pin"))
            balance=checkbalance(aid,pin)
            if balance!=None:
                print("Balance : ",balance)
            else:
                print("invalid credentials")
        case 6:
            aid=int(input("enter id"))
            pin=int(input("enter pin"))
            balance=closeaccount(aid,pin)
            if status==1:
                print("Account found and closed")
            elif status ==2:
                print("Account found and not closed")
            else:
                print("invalid credentials")
        case 7:
            print("Thank you for visiting")
        case _:
            print("wrong choice")


   

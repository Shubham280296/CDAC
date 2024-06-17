#Q4
from abc import ABC,abstractclassmethod
class ABCTel:
    cnt= 1
    @staticmethod
    def __generatecode(etype):
        pid=etype+str(ABCTel.cnt)
        return pid
        
    def __init__(self,name,email,etype):
        self.__pid = ABCTel.__generatecode(etype)
        ABCTel.cnt+=1
        self.__name = name
        self.__email = email
        

    def __str__(self):
        return f"ID : {self.__pid}  Name : {self.__name} Email : {self.__email}"
    
class Vendor(ABCTel):
    def __init__(self,name,email,phno, prodlst,etype = 'v'):
        super().__init__(name,email,etype)
        self.__phno = phno
        self.__prodlst = prodlst
    
    def __str__(self):
        return super().__str__()+ f"\tPhone number: {self.__phno}  List of Products supplied : {self.__prodlst}"
 
class Customers(ABCTel):
    def __init__(self,name,email,creditclass,discounts,plan,etype = 'C'):
        super().__init__(name,email,etype)
        self.__creditclass = creditclass
        self.__discounts = discounts
        self.__plan = plan
  
    def __str__(self):
        return super().__str__()+ f"\tcredit class: {self.__creditclass}  discounts : {self.__discounts} plan : {self.__plan}"

class Indivisual(Customers):
    def __init__(self,name,email,creditclass,discounts,plan,phno):
        super().__init__(name,email,creditclass,discounts,plan)
        self.__phno = phno

    def __str__(self):
        return super().__str__()+ f"\tPhone number: {self.__phno}"
 
class Company(Customers):
    def __init__(self,name,email,creditclass,discounts,plan,relman,creline,extensions,lstnumb):
        super().__init__(name,email,creditclass,discounts,plan)
        self.__relman = relman
        self.__creline = creline
        self.__extensions = extensions
        self.__lstnumb = lstnumb
    
    def __str__(self):
        return super().__str__()+ f"\tRelationship manager: {self.__relman}  Credit line : {self.__creline} extensions : {self.__extensions} List of numbers : {self.__lstnumb}"
   
if __name__ == "__main__":
    ob1=Company(name = 'aaa',email = 'aa@fb',creditclass = 'c',discounts = 0.05,plan = 'A',relman='gdf',creline='as',extensions='01', lstnumb='115314,4545645')
    print(ob1)
    ob2=Indivisual(name = 'bbb',email = 'bb@gf',creditclass = 'd',discounts = 0.01,plan = 'C',phno = 455465431)
    print(ob2)
    ob3=Vendor(name = 'ccc',email = 'cc@fdfg',phno = 4545215, prodlst='cdvgh,fbsfb')
    print(ob3)
  
    

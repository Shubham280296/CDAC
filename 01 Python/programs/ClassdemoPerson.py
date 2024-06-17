from abc import ABC,abstractclassmethod
class Person:
    cnt= 1
    @staticmethod
    def __generatecode(etype):
        pid=etype+str(Person.cnt)
        return pid
        
    def __init__(self,etype = 's',name = ''):
        self.__pid = Person.__generatecode(etype)
        Person.cnt+=1
        self.__pname = name
        
    def get_pid(self):
        return self.__pid
    
    def set_pname(self,name):
        self.__pname = name
    
    def get_pid(self):
        return self.__pname
        
    def __str__(self):
        return f"ID : {self.__pid}  Name : {self.__pname}"
    
class Employee(Person,ABC):
    def __init__(self,etype = 's',name = '',dept = "",desg = ''):
        #call parent constructor
        # WAY 1 - super().__init__(etype,name)
        Person.__init__(self,etype,name)
        self.__dept = dept
        self.__desg = desg
    
    def set_dept(self,dept):
         self.__dept = dept
     
    def get_dept(self):
         return self.__dept
     
    def set_desg(self,desg):
         self.__desg = desg
     
    def get_desg(self):
         return self.__desg 
     
    @abstractclassmethod
    def calsal(self):
        pass
    
    def __str__(self):
        return super().__str__()+ f"\tDepartment: {self.__dept}  Designation : {self.__desg}"
 
class SalEmp(Employee):
    def __init__(self,name = '',dept = "",desg = '',salary = 0,etype = 's'):
        #call parent constructor
        # WAY 1 - super().__init__(etype,name)
        Employee.__init__(self,etype,name,dept,desg)
        self.__salary = salary
        self.__bonus = 0.10*salary
    
    def set_salary(self,salary):
        self.__salary = salary
     
    def get_salary(self):
        return self.__salary
     
    def set_bonus(self,bonus):
        self.__bonus = bonus
     
    def get_bonus(self):
        return self.__bonus
     
    def calsal(self):
        return self.__salary+0.10*self.__salary+0.15*self.__salary-0.08*self.__salary
     
    def __str__(self):
        return Employee.__str__(self)+ f"\tsalary: {self.__salary}  bonus : {self.__bonus}"

class ContractEmp(Employee):
    def __init__(self,name = '',dept = "",desg = '',hr = 0,hrcharges =0,etype = 'c'):
        #call parent constructor
        # WAY 1 - super().__init__(etype,name)
        Employee.__init__(self,etype,name,dept,desg)
        self.__hr = hr
        self.__hrcharges = hrcharges
    
    def set_hr(self,hr):
        self.__hr = hr
     
    def get_hr(self):
        return self.__hr
     
    def set_hrcharges(self,hrcharges):
        self.__hrcharges = hrcharges
     
    def get_hrcharges(self):
        return self.__hrcharges
     
    def calsal(self):
        return self.__hr*self.__hrcharges
         
     
    def __str__(self):
        return Employee.__str__(self)+ f"\thr: {self.__hr}  hrcharges : {self.__hrcharges}"
 
class VendorEmp(Employee):
    def __init__(self,name = '',dept = "",desg = '',numemp = 0,charges =0,etype = 'v'):
        #call parent constructor
        # WAY 1 - super().__init__(etype,name)
        Employee.__init__(self,etype,name,dept,desg)
        self.__numemp = numemp
        self.__charges = charges
    
    def set_numemp(self,numemp):
        self.__numemp = numemp
     
    def get_numemp(self):
        return self.__numemp
     
    def set_charges(self,charges):
        self.__charges = charges
     
    def get_charges(self):
        return self.__charges
     
    def calsal(self):
        return self.__numemp*self.__charges
     
    def __str__(self):
        return Employee.__str__(self)+ f"\tnumemp: {self.__numemp}  charges : {self.__charges}"
    
class Customer(Person):
    def __init__(self,name = '',creditlimit = 0,address = '',etype = 'cu'  ):
        #call parent constructor
        # WAY 1 - super().__init__(etype,name)
        Person.__init__(self,etype,name)
        self.__creditlimit = creditlimit
        self.__address = address
    
    def set_creditlimit(self,creditlimit):
         self.__creditlimit = creditlimit
     
    def get_creditlimit(self):
         return self.__creditlimit
     
    def set_address(self,address):
         self.__address= address
     
    def get_address(self):
         return self.__address
     
    def __str__(self):
        return super().__str__()+ f"\tCredit limit: {self.__creditlimit}  address : {self.__address}"

    
if __name__ == "__main__":
    ob1=SalEmp(name = 'a',dept = "e",desg = 'i',salary=100000)
    print(ob1)
    ob2=ContractEmp(name = 'b',dept = "f",desg = 'j',hr=100,hrcharges=1000)
    print(ob2)
    ob3=VendorEmp(name = 'c',dept = "g",desg = 'k',numemp=10,charges=5000)
    print(ob3)
    ob4=Customer(name = 'd',creditlimit=100000,address='m')
    print(ob4)
    print("Charges: ",ob1.calsal())
    print("Charges: ",ob2.calsal())
    print("Charges: ",ob3.calsal())
    
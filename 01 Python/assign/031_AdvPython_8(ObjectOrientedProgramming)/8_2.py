#Q2

class Student:
    cnt= 1
    @staticmethod
    def __generatecode():
        studid=Student.cnt
        return studid
        
    def __init__(self,name = '',m1=0,m2=0,m3=0):
        self.__studid = Student.__generatecode()
        Student.cnt+=1
        self.__name = name
        self.__m1 = m1
        self.__m2 = m2
        self.__m3 = m3
        
        
    def get_studid(self):
        return self.__studid
    
    def set_name(self,name):
        self.__name = name
    
    def get_name(self):
        return self.__name
    
    def set_m1(self,m1):
        self.__m1 = m1
    
    def get_m1(self):
        return self.__m1
    
    def set_m2(self,m2):
        self.__m2 = m2
    
    def get_m2(self):
        return self.__m2
    
    def set_m3(self,m3):
        self.__m3 = m3
    
    def get_m3(self):
        return self.__m3
    
    def calculateGPA(self):
        return (self.__m1+self.__m2+self.__m3)/3
        
    
    def __str__(self):
        return f"Student ID : {self.__studid}  \nName : {self.__name} \nM1: {self.__m1} \nM1: {self.__m2} \nM1: {self.__m3}"

def displayall():
    for ob in studlst:
        print(ob)

def SearchById(studid):
    for ind,ob in enumerate(studlst):
        if ob.get_studid()==studid:
            return ind,ob
    return -1,None

def SearchByname(name):
    for ind,ob in enumerate(studlst):
        if ob.get_name()==name:
            return ind,ob
    return -1,None   

def GPAforID(pid):
    pos,e=SearchById(pid)
    if e!=None:
        return e.calculateGPA()
    else:
        return -1
    
studlst=[Student("Divya",78,86,89),Student("Aditya",85,81,92)]

choice=0
while choice!=7:
    choice=int(input("""
1. Display All Student
2. Search by id
3. Search by name
4. calculate GPA of a student
5. Exit
choice - """))
    match choice:
        case 1:
            displayall()
        case 2:
            studid=int(input("enetr id"))
            pos,e=SearchById(studid)
            if e!=None:
                print(e)
            else:
                print("Not found====>",studid)
        case 3:
            name=input("enetr name")
            pos,e=SearchByname(name)
            if e!=None:
                print(e)
            else:
                print("Not found====>",studid)
        case 4:
            studid=int(input("enetr id"))
            GPA=GPAforID(studid)
            if GPA!=-1:
                print("GPA:",GPA)
            else:
                print("Not found====>",studid)
        case 5:
            print("Thank you for visiting")
        case _:
            print("wrong choice")




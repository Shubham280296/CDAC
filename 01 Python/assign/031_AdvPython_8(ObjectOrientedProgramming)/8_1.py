#Q1
class Student:
    cnt= 1
    @staticmethod
    def __generatecode():
        pid=str(Student.cnt)
        return pid
        
    def __init__(self,name = '',m1=0,m2=0,m3=0):
        self.__pid = Student.__generatecode()
        Student.cnt+=1
        self.__pname = name
        self.__m1 = m1
        self.__m2 = m2
        self.__m3 = m3
        
        
    def get_pid(self):
        return self.__pid
    
    def set_pname(self,name):
        self.__pname = name
    
    def get_pname(self):
        return self.__pname
    
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
    
    def __str__(self):
        return f"Student ID : {self.__pid}  \nName : {self.__pname} \nM1: {self.__m1} \nM1: {self.__m2} \nM1: {self.__m3}"

stud1 = Student("Divya",m1=78,m2=86,m3=89)
print(stud1)
stud2 = Student("Aditya",m1=85,m2=81,m3=92)
print(stud2)

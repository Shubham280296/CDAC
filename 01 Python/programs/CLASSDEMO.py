class Person:
    def __init__(self,pid = 0,pname="",mob=""):
        self.__pid = pid
        self.__pname = pname
        self.__mobile = mob

    def __str__(self):
        return f"ID:{self.__pid} \tname:{self.__pname} \tmobile:{self.__mobile}"

    def set__pid(self,pid):
        self.__pid = pid

    def get__pid(self):
        return self.__pid

    def set__pname(self,pname):
        self.__pname = pname

    def get__pid(self):
        return self.__pname

    def set__mobile(self,mobile):
        self.__mobile = mobile

    def get__mobile(self):
        return self.__mobile

P1 = Person(12,"Rajan",1111)
print(P1)
P1.set__mobile(3333)
print(P1.get__mobile())

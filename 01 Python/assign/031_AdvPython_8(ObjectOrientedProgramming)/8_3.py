#Q3
class Friend:
    cnt= 1
    @staticmethod
    def __generatecode():
        fid=Friend.cnt
        return fid
        
    def __init__(self,name = '',srname='',hob='',mobno=0,email='',bdate=0,address=''):
        self.__fid = Friend.__generatecode()
        Friend.cnt+=1
        self.__name = name
        self.__srname = srname
        self.__hob = hob
        self.__mobno = mobno
        self.__email = email
        self.__bdate = bdate
        self.__address = address
        
        
    def get_fid(self):
        return self.__fid
    
    def set_name(self,name):
        self.__name = name
    
    def get_name(self):
        return self.__name
    
    def set_srname(self,srname):
        self.__srname = srname
    
    def get_srname(self):
        return self.__srname
    
    def set_hob(self,hob):
        self.__hob = hob
    
    def get_hob(self):
        return self.__hob
    
    def set_mobno(self,mobno):
        self.__mobno = mobno
    
    def get_mobno(self):
        return self.__mobno
    
    def set_email(self,email):
        self.__email = email
    
    def get_email(self):
        return self.__email

    def set_bdate(self,bdate):
        self.__bdate = bdate
    
    def get_bdate(self):
        return self.__bdate

    def set_address(self,address):
        self.__address = address
    
    def get_address(self):
        return self.__address

    def __str__(self):
        return f"Name: {self.__name}  Last name : {self.__srname} Hobbies : {self.__hob} Mobile number : {self.__mobno} Email ID : {self.__email} Date of Birth : {self.__bdate} Address : {self.__address}"
        

def displayall():
    for ob in flst:
        print(ob)

def SearchById(studid):
    for ob in flst:
        if ob.get_fid()==studid:
            return ob
    return None

def SearchByname(name):
    for ob in flst:
        if ob.get_name()==name:
            return ob
    return None   

def SearchByhob(hob):
    for ob in flst:
        if hob in ((ob.get_hob()).split(",")):
            return ob
    else :
        return None           

    
flst=[Friend("Netra","Patil","painting,hiking",9876543210,"netra@gmail.com",31051996,"123 abc,pune"),Friend("Pratik","Mo2re","cooking,reading",9870123456,"pratik@gmail.com",30061997,"245 xyz,pune")]


choice=0
while choice!=5:
    choice=int(input("""
1. Display All Friend
2. Search by id
3. Search by name
4. Display all friend with a particular hobby 
5. Exit
choice - """))
    match choice:
        case 1:
            displayall()
        case 2:
            studid=int(input("enetr id - "))
            e=SearchById(studid)
            if e!=None:
                print(e)
            else:
                print("Not found====>",studid)
        case 3:
            name=input("enetr name - ")
            e=SearchByname(name)
            if e!=None:
                print(e)
            else:
                print("Not found====>",name)
        case 4:
            hob=input("enetr friends with a particular hobby - ")
            e=SearchByhob(hob)
            if e!=None:
                print(e)
            else:
                print("Not found====>",hob)
            
        case 5:
            print("Thank you for visiting")
        case _:
            print("wrong choice")



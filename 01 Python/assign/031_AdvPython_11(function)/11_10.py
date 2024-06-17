#Q10
def correct(str1):
    global str2
    i=0
    while i < len(str1):
        j=0
        bool = False
        while j< (len(str1[i])-1):
            if (str1[i][j] == ".") and (str1[i][j+1].isalpha()):
                pos = j
                bool = True
            j += 1
        if bool:
            str2 = str2+str1[i][:pos+1]+" "+str1[i][pos+1:]
        else :
            str2=str2+str1[i]+" "
        i += 1
            
str2 = "" 
str1 = input("enter string - ").split()
correct(str1)
print("Corrected string - ",str(str2))    

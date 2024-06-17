#Q1
str1=input("Enter the string - ")
str2 = str1
choice='f'
while choice!='e':
    choice=input("""
    a. display characters from even position
    b. display characters from odd position
    c. display length of a string
    d. add a at the end of string length times
    e. exit\n""")
    match choice:
        case 'a':
            print(f"characters from even position - '{str2[1::2]}'")
            
        case 'b':
            print(f"characters from odd position - '{str2[::2]}'")

        case 'c':
            print("length of a string - ",len(str2))

        case 'd':
            str1+=("a"*len(str1))
            print(f"length of a string - '{str2}'")

        case 'e':
            print("Thank you for visiting.....")
        case _:
            print("wrong choice")
        



    

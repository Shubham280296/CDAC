#Q9
year = int(input("Enter a Yearto check if leap or not - "))
if year%100 == 0:
    if year%400 == 0:
        print("It is leap year")
    else:
        print("It is not leap year")
else :
    if year%4 == 0:
        print("It is leap year")
    else:
        print("It is not leap year")

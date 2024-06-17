#Q1
numdays = int(input("enter no of days in month - "))
while numdays<28 or numdays>31:
       print("incorrect input")

startday=int(input("enter the day of week the month starts 0-monday 1-tuesday..."))
print("mon\ttue\twed\tthu\tfri\tsat\tsun")
print(" \t"*startday,end="")
i=1
while i<numdays+1 :
    print(f" {i}\t",end="")
    startday +=1 
    i += 1
    if startday >6:
        startday =0
        print("\n")







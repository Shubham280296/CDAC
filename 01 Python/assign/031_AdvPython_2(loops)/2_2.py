#Q2
#a star patterb
n1 = 4
for i in range(n1):
    print("*"*(i+1))

print()
#b diamond pattern
n2 = a = 5
while a>0:
    print(" "*(abs(n2//2-a+1)),end="")
    print("*"*(n2-2*(abs(n2//2-a+1))))
    a-=1

print()
#c
n3 = a = 7
while a>0:
    print(" "*((n3-a)//2),end="")
    print("1",end="")
    print(" 0 1"*(a//2))
    a-=2

print()
#d
n4 = 5
for i in range(n4):
    for j in range (i+1):
        print(j+1,end="")
    print()

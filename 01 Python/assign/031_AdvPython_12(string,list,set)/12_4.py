#Q4
citylist = (input("Enter names of cities - ")).split(" ")
loclist = (input("Enter locations of cities - ")).split(" ")
for n,l in zip(citylist,loclist):
    print(f"{n}--{int(l)}")

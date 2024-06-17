#Q7
def numcheck(list1,num,numadd):
    instance = list1.count(num)
    prevind = 0
    for i in range(instance):
        ind = list1[prevind:].index(num)
        list1.insert(prevind+ind+1,numadd)
        prevind = ind+1
    for l in list1:
        if isinstance(l,list):
            numcheck(l,num,numadd)
    else:
        return None

list1 = [10,20,[300,400,500,[5000,6000]],30,40]
num = 6000
numadd = 7000
numcheck(list1,num,numadd)
print(list1)

#Q1
import numpy as np

a = np.arange(1,16).reshape(3,5)
b = np.arange(1,30,2).reshape(5,3)
print("a : \n",a)
print("b : \n",b)

print(f"shape of matrix a : {a.shape}")
print(f"shape of matrix b : {b.shape}")

print(f"matrix multiplication : \n{a.dot(b)} ")

c=np.random.rand(3,5)
print("c : \n",c)

list1 = np.array([x for x in range(5)])
list2 = np.array([x for x in range(6,11)])

list3 = np.array([x for x in range(11,16)])
list4 = np.array([x for x in range(16,21)])

nd1 = np.vstack((list1,list2))
nd2 = np.vstack((list3,list4))

print("NDarray 1 : \n",nd1)
print("NDarray 2 : \n",nd2)


print("Memmerwise addition : \n",nd1+nd2)
print("Memmerwise subtraction : nd2-nd1\n",nd2-nd1)
print("Memmerwise multiplication : \n",nd1*nd2)
print("exponential of nd1 : \n",np.exp(nd1))
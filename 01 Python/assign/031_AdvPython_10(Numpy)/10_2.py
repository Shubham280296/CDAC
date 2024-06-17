#Q2
import numpy as np
import matplotlib.pyplot as plt 
deal1 =(np.random.randint(5,size=(10,6)))*10000
deal2 =(np.random.randint(6,size=(10,6)))*10000

print(f" yearwise sales of tv,freeze,mobile,….. products by dealer 1 : \n{deal1}")
print(f" yearwise sales of tv,freeze,mobile,….. products by dealer 2 : \n{deal2}")

print(f" total yearwise sales of tv,freeze,mobile,….. products by both dealers : \n{deal1+deal2}")


print(f"Yearwise total sales for dealer 1 : \n{np.sum(deal1,axis=1)}")
print(f"Yearwise total sales for dealer 2 : \n{np.sum(deal2,axis=1)}")

print(f"average sales of a 2005 year for dealer 1 : {np.mean(deal1[4,:])}")
print(f"average sales of a 2005 year for dealer 2 : {np.mean(deal2[4,:])}")

print(f"max sales of a 2005 year for dealer 1 : {np.max(deal1[4,:])}")
print(f"max sales of a 2005 year for dealer 2 : {np.max(deal2[4,:])}")

print(f"TV and freeze sales for dealer 1 : {np.sum(deal1[:,0:2],axis = 0)}")
print(f"TV and freeze sales for dealer 2 : {np.sum(deal2[:,0:2],axis = 0)}")

X = np.arange(2001,2011) 
X_axis = np.arange(len(X)) 
  
plt.bar(X_axis - 0.2, np.sum(deal1,axis=1), 0.4, label = 'Dealer 1') 
plt.bar(X_axis + 0.2, np.sum(deal2,axis=1), 0.4, label = ' Dealer 2') 
  
plt.xticks(X_axis, X) 
plt.xlabel("Years") 
plt.ylabel("Total number of sales") 
plt.title("Total number of Sales in each year") 
plt.legend() 
plt.show() 

plt.pie(np.sum(deal1,axis=1),labels=X)
plt.title("Total number of Sales in each year for dealer 1") 
plt.show()

plt.pie(np.sum(deal2,axis=1),labels=X)
plt.title("Total number of Sales in each year for dealer 2") 
plt.show()
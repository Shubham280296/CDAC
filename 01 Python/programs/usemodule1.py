'''
import module1
print("in usemodule1")
module1.f1(34)
module1.f2()
'''
'''
#using alias name
import module1 as m1
m1.f1(34)
m1.f2()
'''
##import sys
##sys.path.append(r"C:\Users\Administrator.DAI-PC2\Downloads")
#using from
from module1 import *
f1(10)
f2()

#Q2
import re
Lines = input("Enter the lines - ").split(". ")

for ln in Lines:
    m1 = re.search("^\d|^[a-zA-Z]{2}.*",ln)
    if (m1!=None):
        print(ln)

# This is man. 7 is number. a8 is wrong. T is an alphabate.

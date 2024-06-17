# Question_2

import pandas as pd

# make list of employees, their company names and salaries respectively
employee = ["amit", "mohit", "vijay", "snehal", "sneha"]
company = "cdac"
salary = [50000, 60000, 63000, 47000, 89999]

# store the list as values in dictionary, with keys equal to the name of columns of Dataframe to be created
dict1 = {"id":1, "name":employee, "company":company}
dict2 = {"id":1, "salary":salary}

# create dataframes of the dictionaries
first_df = pd.DataFrame(dict1)
second_df = pd.DataFrame(dict2)

# Employee id starts with 6001, thus start the id with 6001 (an emp_id list can also be created instead emp_id = [6001, 6002, 6003, 6004, 6005])
first_df.id = first_df.index + 6001

# Merge or concat both the dataframes
final_df = pd.concat([first_df, second_df["salary"]], axis=1)
print(final_df) 



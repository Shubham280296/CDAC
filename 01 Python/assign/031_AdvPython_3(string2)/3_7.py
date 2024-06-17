#Q7
# define a recursive function to get sum of all terms from 1 to x
def sum(x):
    if x == 1:
        return 1
    return x+sum(x-1)

x = 10
print(sum(10))

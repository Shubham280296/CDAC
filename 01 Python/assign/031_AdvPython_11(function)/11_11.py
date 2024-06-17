#Q11
def isvowel(ch):
    vowel = "aeiou"
    if ch in vowel:
        return True
    return False
def make_ing_form(str1):
    global str2
    if str1[-2:] == "ie":
        str2 = str1[:-2]+"ying"
    elif str1[-1] == "e":
        str2 = str1[:-1]+"ing"
    elif ((not(isvowel(str1[-3])))and(isvowel(str1[-2]))and(not(isvowel(str1[-1])))):
        str2 = str1+str1[-1]+"ing"
    else:
        str2 =str1+"ing"

str1 = input("enter string - ")
make_ing_form(str1)
print(f"Present participle of {str1} - {str2}")

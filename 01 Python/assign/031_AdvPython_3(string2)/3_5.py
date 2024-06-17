#Q5
phrase = input('Enter the phrase - ')
vowels = "aeiouAEIOU"
phrase1=""
for i in phrase:
    if i in vowels or not(i.isalpha()):
        phrase1 = phrase1+i
    else:
        phrase1 = phrase1+i+'o'+i
print(phrase1)
        
    

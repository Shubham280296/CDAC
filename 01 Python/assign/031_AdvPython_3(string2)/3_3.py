#Q3
phrase = input('Enter the phrase - ')
phrase1 = ""
for i in phrase:
    if i.isalpha():
        phrase1 = phrase1+i.upper()
rphrase = phrase1[::-1]
if phrase1 == rphrase:
    print("phrase is a palindrome")
else:
    print("phrase is not a palindrome")
    

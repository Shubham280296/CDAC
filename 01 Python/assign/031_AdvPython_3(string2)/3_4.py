#Q4
phrase = input('Enter the phrase - ')
alfabet = "abcdefghijklmnopqrstuvwxyz"
phrase = phrase.lower()
for i in alfabet:
    if i not in phrase:
        print("phrase is not a pangram")
        break
else:
    print("phrase is a pangram")
    

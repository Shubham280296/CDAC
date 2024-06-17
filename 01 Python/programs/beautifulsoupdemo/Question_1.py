# Question_1
str1 = input("Enter a string: ")

symbols = [",", ".", "#", "@", "!", "^", "*", "$", "%", "(", ")", "[", "]", ";", ":", "{", "}", "|", "\\", ">", "<"]

# loop to iterate through the input string
for ch in str1:
    # if character is symbol, replace with empty string
    if ch in symbols:
        str1 = str1.replace(ch,"")
print(str1)
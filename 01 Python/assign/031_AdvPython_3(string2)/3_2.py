#Q2
heights = []
i=0
while ((height:=input("Enter height of histogram (enter q to end entering more heughts - )"))!='q'):
    heights.append(int(height))
    i+=1
for i in range(len(heights)):
    print("*"*int(heights[i]))
 

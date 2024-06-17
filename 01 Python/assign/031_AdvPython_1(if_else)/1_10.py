#Q10
price = int(input("Enter the price of bike - "))
totalprice = price
if price <=50000:
    roadtax = price*0.05
    insurance = price*0.05
elif price <=100000:
    roadtax = price*0.10
    insurance = price*0.08
else:
    roadtax = price*0.15
    insurance = price*0.2
print(f"road tax = {roadtax}\n insurance = {insurance}\n total price = {price+roadtax+insurance}")

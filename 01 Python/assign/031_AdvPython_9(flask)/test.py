import requests

print("send get request")
response = requests.get("http://127.0.0.1:5000/employee")
print(response)
print(response.content) # Return the raw bytes of the data payload
#response.text() # Return a string representation of the data payload
#print(response.json()) # This method is convenient when the API returns JSON


print("send put request")
response = requests.put('http://127.0.0.1:5000/employee/1', data = {'eid':4,'name':'ttt','salary':25000,'dept':'trainee'})
print(response.content)

print("send get one data request")
response = requests.get('http://127.0.0.1:5000/employee/3')
print(response.content)


print("send delete request")
response = requests.delete('http://127.0.0.1:5000/employee/2')
print(response.content)


print("send post request")
response = requests.post('http://127.0.0.1:5000/employee', data = {'eid':9,'name':'sss','salary':65000,'dept':'software eng'})
print(response)
print(response.content)
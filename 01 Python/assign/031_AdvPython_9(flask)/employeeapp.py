from flask import Flask,request
from employeecrud import *
app=Flask(__name__)

@app.route("/employee",methods=['GET'])
def getallemployee():
    return findallemployee()

@app.route('/employee',methods=['POST'])
def addemployee():
    #data=request.json()
    print(request.form['eid'])
    data=request.form
    #print(request.json['pname'])
    #print(data)
    addnewemployee(data)
    return "added successfully"

@app.route('/employee/<eid>',methods=['PUT'])
def updateemployee(eid):
    print("in put",eid)
    data=request.form
    #print(request.json['pid'])
    #print(data)
    modifyemployee(data)
    return "updated successfully"

@app.route('/employee/<eid>',methods=['DELETE'])
def deleteemployee(eid):
    print("in delete ",eid)
    deleteemp(eid)
    return "deleted successfully"

@app.route('/employee/<eid>',methods=['GET'])
def getemployeebyid(eid):
    print("in get one employee ",eid)
    return getoneemployee(eid)

if __name__=="__main__":
    app.run()

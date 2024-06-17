from flask import Flask,request
from employeedao.employeecrud import *
app=Flask(__name__)

@app.route("/products",methods=['GET'])
def getallproducts():
    return findallproduct()

@app.route('/products',methods=['POST'])
def addproduct():
    #data=request.json()
    print(request.form['pid'])
    data=request.form
    #print(request.json['pname'])
    #print(data)
    addnewproduct(data)
    return "added successfully"

@app.route('/products/<pid>',methods=['PUT'])
def updateproduct(pid):
    print("in put",pid)
    data=request.form
    #print(request.json['pid'])
    #print(data)
    modifyproduct(data)
    return "updated successfully"

@app.route('/products/<pid>',methods=['DELETE'])
def deleteproduct(pid):
    print("in delete ",pid)
    deletedata(pid)
    return "deleted successfully"

@app.route('/products/<pid>',methods=['GET'])
def getproductbyid(pid):
    print("in get one product ",pid)
    return getonedata(pid)


if __name__=="__main__":
    app.run()
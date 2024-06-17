import sqlite3
import json

def deleteemp(eid):
    con=sqlite3.connect(r"C:\Users\Administrator.DAI-PC2\Downloads\Shubham\python\031_AdvPython_9(flask)\empdb\empdb.db")
    cursor=con.cursor()
    cursor.execute("delete from employee where eid=?",(eid,))
    con.commit()
    cursor.close()
    con.close()
    return True

def getoneemployee(eid):
    con=sqlite3.connect(r"C:\Users\Administrator.DAI-PC2\Downloads\Shubham\python\031_AdvPython_9(flask)\empdb\empdb.db")
    cursor=con.cursor()
    cursor.execute("select * from employee where eid=?",(eid,))
    row=cursor.fetchone()
    result = []
    d = {}
    for i, col in enumerate(cursor.description):
        d[col[0]] = row[i] #{"eid":12,"pname":"xxx"}
        result.append(d)
    if len(result)>0:
        #return {"payload":result}
        print(result)
        #convert dictionary into json fomat
        cursor.close()
        con.close()
        return json.dumps(result)
            # return make_response({"payload":result},200)
    else:
        return "No Data Found"

def modifyemployee(data):
    con=sqlite3.connect(r"C:\Users\Administrator.DAI-PC2\Downloads\Shubham\python\031_AdvPython_9(flask)\empdb\empdb.db")
    cursor=con.cursor()
    cursor.execute("update employee set name=?,salary=?,dept=? where eid=?",(data['name'],data['salary'],data['dept'],data['eid']))
    con.commit()
    cursor.close()
    con.close()
    return True

def addnewemployee(data):
    con=sqlite3.connect(r"C:\Users\Administrator.DAI-PC2\Downloads\Shubham\python\031_AdvPython_9(flask)\empdb\empdb.db")
    cursor=con.cursor()
    cursor.execute("insert into employee values(?,?,?,?)",(data['eid'],data['name'],data['salary'],data['dept']))
    con.commit()
    cursor.close()
    con.close()
    return True

def findallemployee():
    con=sqlite3.connect(r"C:\Users\Administrator.DAI-PC2\Downloads\Shubham\python\031_AdvPython_9(flask)\empdb\empdb.db")
    cursor=con.cursor()
    cursor.execute("select * from employee")
    rows=cursor.fetchall()
    result = []
    for row in rows:
        d = {}
        for i, col in enumerate(cursor.description):
            d[col[0]] = row[i] #{"eid":12,"pname":"xxx"}
        result.append(d)
    if len(result)>0:
        #return {"payload":result}
        print(result)
        #convert dictionary into json fomat
        cursor.close()
        con.close()
        return json.dumps(result)
            # return make_response({"payload":result},200)
    else:
        return "No Data Found"
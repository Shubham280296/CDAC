from flask import Flask
app = Flask(__name__)

@app.route('/') ## decorater if url == localhost url + '/'
def hello_world():
    return("Welcome to Flask Apllication!!!")

@app.route('/hello') ## decorater if url == localhost url + '/'hello
def hello_world():
    return("Hello world!!!")

@app.route('/welcome') ## decorater if url == localhost url + '/'hello
def hello_world():
    return("This is welcome page")

if __name__ == '__main__':
    app.run(debug = True) ## debug == True  --- changes in program (after saving) are directly visible in url after refreshing 

from flask import Flask
app = Flask(__name__)

@app.route('/') ## decorater if url == localhost url + '/'
def hello_world():
    return("Hello world!!!")

if __name__ == '__main__':
    app.run(debug = True) ## debug == True  --- changes in program (after saving) are directly visible in url after refreshing 

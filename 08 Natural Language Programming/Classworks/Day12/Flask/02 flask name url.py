from flask import Flask
app = Flask(__name__)

@app.route('/<name>')
def hello_world(name):
    return("Welcome %s" %name)

@app.route('/')
def hello_world():
    return("This is welcome page.")

if __name__ == '__main__':
    app.run(debug = True) ## debug == True  --- changes in program (after saving) are directly visible in url after refreshing 

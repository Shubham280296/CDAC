## Import flask
from flask import Flask, request, redirect, url_for

# address
app = Flask(__name__)

#@app.route('/<name>')

@app.route('/success/<name>')
def success(name):
    return 'Welcome %s' % name


@app.route('/admin')
def hello_admin():    
    #return('Hello %s' %name)
    return 'Hello Admin'


@app.route('/guest/<guest>')
def hello_guest(guest):
    return 'Hello %s as Guest' % guest

@app.route('/login/', methods=['GET', 'POST'])
def login():
    if request.method =='POST':
        user = request.form['nm']
        return redirect(url_for('success', name = user))    

@app.route('/user/<name>')
def hello_user(name):
    if name == 'admin':
        return redirect(url_for('hello_admin'))
    else:
        return redirect(url_for('hello_guest', guest = name))

if __name__ == '__main__':
    app.run(debug=True)

# @app.route('/hello', methods=['GET', 'POST'])
# def hello():
#     name = request.args.get('name')
#     return "Hello, "+name+" there!"

# @app.route('/welcome', methods=['GET', 'POST'])
# def hello_word():
#     name = request.args.get('name')
#     return "Welcome, "+name


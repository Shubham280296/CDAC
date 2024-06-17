from flask import Flask, render_template, request
app = Flask(__name__)


import joblib
from nltk.tokenize import word_tokenize
from nltk.corpus import stopwords
from nltk.stem import PorterStemmer

## Stopwords for cleaning
swords = stopwords.words('english')

## Cleaning function
def clean_text(sent):
    tokens1 = word_tokenize(sent) ## tokenize
    tokens2 = [token for token in tokens1 if token.isalnum()] ## remove punctuations
    swords = stopwords.words('english')
    tokens3 = [token for token in tokens2 if token.lower() not in swords] ## Remove stopwords
    ps = PorterStemmer()
    tokens4 = [ps.stem(token) for token in tokens3] ## stemming
    return tokens4

classifier = joblib.load('classifier.model') ## upload model
tfidf = joblib.load('preprocessor.model') ## upload tfidf tranformer parameters

@app.route('/')
def student():
    return render_template('spamdetector.html')

@app.route('/spamfinder', methods = ['POST', 'GET'])
def result():
    if request.method == 'POST':
        data = dict(request.form)
        message = tfidf.transform([data['message']])
        data['result'] = classifier.prdict(message)[0]
        return render_template('spamoutput.html', data=data)

if __name__ == '__main__':
    app.run(debug = True)
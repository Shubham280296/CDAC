import requests
from bs4 import BeautifulSoup
import re
url = 'https://en.wikipedia.org/wiki/Academy_Award_for_Best_Picture'
response = requests.get(url)
print(response.text)


html_soup = BeautifulSoup(response.text,'html.parser')
type(html_soup)
print(html_soup)

award_list = html_soup.find_all("tr",{"style":'background:#FAEB86'})
print(len(award_list))

first_award = award_list[0]
print(first_award)

data=first_award.find("a",{"href":re.compile('film\)')})
val=data["href"]
print(val)


newurl="https://en.wikipedia.org"+val
print(newurl)
newresponse = requests.get(newurl)
print(newresponse.text)
newdata = BeautifulSoup(newresponse.text,"html.parser")
title=newdata.select("h1[id='firstHeading'] i")[0].text
title1=newdata.select_one("h1[id='firstHeading'] i").text
print(title)
print(title1)

title=newdata.select("tr:-soup-contains('Directed by') a[href*='/wiki/']")[0].text
title1=newdata.select_one("tr:-soup-contains('Directed by') a[href*='/wiki/']").text
print(title)
print(title1)

title=newdata.select("tr:-soup-contains('Release dates') li")[0].text
title1=newdata.select_one("tr:-soup-contains('Release dates') li").text
print(title)
print(title1)


name = []
directedby = []
releaseddate = []
for movie in award_list:
    data=movie.find("a",{"href":re.compile('film\)')})
    if data!=None:
        val=data["href"]
        newurl="https://en.wikipedia.org"+val
        newresponse = requests.get(newurl)
        newdata = BeautifulSoup(newresponse.text,"html.parser")
        title=newdata.select_one("h1[id='firstHeading'] i").text
        if title!=None:
            name.append(title)
        else:
            name.append("")
        directby=newdata.select_one("tr:-soup-contains('Directed by') a[href*='/wiki/']")
        if directby!=None:
            directedby.append(directby)
        else:
            directedby.append("")
        releasedate=newdata.select_one("tr:-soup-contains('Release date') li")
        if releasedate!=None:
            releaseddate.append(releasedate)
        else:
            releaseddate.append("")
    
d={"title":name,"directed by":directedby,"released date":releaseddate}
import pandas as pd
df = pd.DataFrame(d)
print(df.head())
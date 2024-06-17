import scrapy
import time
import requests

class AwardSpider(scrapy.Spider):
	name ="awards"
	start_urls=['https://en.wikipedia.org/wiki/Academy_Award_for_Best_Picture']

	def parse(self,response):
		'''
		data ={}
		data['title']=response.css("title::text").extract()
		yield data
		'''

		for ln in response.css(r"tr[style='background:#FAEB86'] a[href*='film)']::attr('href')").extract():
			url = response.urljoin(ln)
			print(url)
			req=scrapy.Request(url,callback=self.parse_titles)
			time.sleep(5)
			yield req

	def parse_titles(self,response):
		for sel in response.css('html').extract():
			data={}
			data['title']=response.css(r"h1[id='firstHeading'] i::text").extract()
			data['directedby']=response.css(r"tr:contains('Directed by') a[href*='/wiki/']::text").extract()
			data['releasedate']=response.css(r"tr:contains('Release dates') li::text").extract()
			yield data





from django.shortcuts import render

from django.http import HttpResponse

def index(request):
	return HttpResponse("Hello, World!")

def welcome(request):
	return HttpResponse("Welcome")

def thebest(request):
	return HttpResponse("Shubham and Satyasish are the best!!")
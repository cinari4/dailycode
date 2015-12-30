from django.shortcuts import render
from django.http import HttpResponse
from django.http import JsonResponse
import requests

def index(request):
	r = requests.get('http://httpbin.org/status/418')
	return HttpResponse('<pre>' + r.text + '</pre>')

def convert(request):
    return render(request, 'convert.html')

def divide(request):
    return render(request, 'divide.html')

def dailypost(request):
    return render(request, 'dailypost.html')

def parsetest(request):
    return render(request, 'parsetest.html')

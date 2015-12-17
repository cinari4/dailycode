from django.shortcuts import render
from django.http import HttpResponse
from django.http import JsonResponse

def index(request):
    return render(request, 'index.html')

def convert(request):
    return render(request, 'convert.html')

def divide(request):
    return render(request, 'divide.html')

def dailypost(request):
    return render(request, 'dailypost.html')

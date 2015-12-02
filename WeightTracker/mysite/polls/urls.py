
from django.conf.urls import include, url
from polls import view

urlpatterns = [
    url(r'^$', views.index, name='index'),
    url(r'^polls/(?P<question_id>\d+)/$', view.detail, name='detail'),
    url(r'^polls/(?P<question_id>\d+)/vote/$', view.vote, name='vote'),
    url(r'^polls/(?P<question_id>\d+)/results/$', view.results, name='results'),
 ]

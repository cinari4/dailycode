from django.conf.urls import patterns, include, url

from django.contrib import admin
admin.autodiscover()

import weighttracker.views

urlpatterns = patterns('',
    # Examples:
    # url(r'^$', 'gettingstarted.views.home', name='home'),
    # url(r'^blog/', include('blog.urls')),
    # url(r'^db', hello.views.db, name='db'),
    # url(r'^admin/', include(admin.site.urls)),
    url(r'^$', weighttracker.views.index, name='index'),
    url(r'^weighttracker/convert', weighttracker.views.convert, name='convert'),
    url(r'^weighttracker/divide', weighttracker.views.divide, name='divide'),
    url(r'^weighttracker/dailypost', weighttracker.views.dailypost, name='dailypost'),
)

from django.conf.urls import include, url

from profile_app import views
from rest_framework.authtoken import views as authviews
from django.urls import path

urlpatterns = [
    url(r'^profile/$', views.ShowProfile.as_view(), name='restapp-profile'),
]
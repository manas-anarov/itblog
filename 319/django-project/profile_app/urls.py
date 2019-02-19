from django.conf.urls import include, url

from profile_app import views

urlpatterns = [
    url(r'^profile/$', views.ShowProfile.as_view()),
]
from django.conf.urls import url

from my_app import views

urlpatterns = [
    url(r'^list/$', views.PostListAPIView.as_view()),
]
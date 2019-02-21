from django.conf.urls import include, url
from image_app import views

urlpatterns = [
    url(r'^upload/$', views.ImageCreateAPIView.as_view()),
]
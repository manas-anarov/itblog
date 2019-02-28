from django.conf.urls import url

from create_app import views

urlpatterns = [
    url(r'^create/$', views.PostCreateAPIView.as_view()),
]
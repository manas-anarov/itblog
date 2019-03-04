from delete_app import views
from django.conf.urls import url

urlpatterns = [
	url(r'^delete/(?P<id>[\w-]+)/$', views.DeletePost.as_view()),
]
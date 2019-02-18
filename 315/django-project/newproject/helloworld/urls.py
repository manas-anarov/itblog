from helloworld import views
from django.conf.urls import url
from .views import (
    PostUpdate,
    )

urlpatterns = [
	url(r'^(?P<id>[\w-]+)/edit/$', PostUpdate.as_view()),
]

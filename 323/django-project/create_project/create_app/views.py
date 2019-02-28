
from .serializers import CreateSerializer

from rest_framework.generics import (CreateAPIView)
from rest_framework.views import APIView
from create_app.models import Post

class PostCreateAPIView(CreateAPIView):
	serializer_class = CreateSerializer
	queryset = Post.objects.all()
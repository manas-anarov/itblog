
from .serializers import listSerializer

from rest_framework.generics import (ListAPIView)
from my_app.models import Post

class PostListAPIView(ListAPIView):
    serializer_class = listSerializer
    queryset = Post.objects.all()
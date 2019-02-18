from .serializers import updateSerializer
from rest_framework.generics import (UpdateAPIView)
from helloworld.models import Post

class PostUpdate(UpdateAPIView):

	queryset = Post.objects.all()
	serializer_class = updateSerializer
	lookup_field = 'id'

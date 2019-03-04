from .serializers import DeleteSerializer

from rest_framework.generics import (DestroyAPIView)
from delete_app.models import Post


class DeletePost(DestroyAPIView):

	queryset = Post.objects.all()
	serializer_class = DeleteSerializer
	lookup_field = 'id'
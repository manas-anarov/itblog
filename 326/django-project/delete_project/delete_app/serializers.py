from rest_framework import serializers


from rest_framework.serializers import (
      ModelSerializer,
)

from delete_app.models import Post

class DeleteSerializer(ModelSerializer):
   class Meta:
      model = Post
      fields = [
         'title',
         'text',
      ]
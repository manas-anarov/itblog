from rest_framework import serializers

from rest_framework.serializers import (
      ModelSerializer,
)

from my_app.models import Post


class listSerializer(ModelSerializer):
   class Meta:
      model = Post
      fields = [
         'title',
         'text',
]
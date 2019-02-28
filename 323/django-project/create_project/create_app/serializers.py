from rest_framework import serializers


from rest_framework.serializers import (
      ModelSerializer,
)

from create_app.models import Post



class CreateSerializer(ModelSerializer):
   class Meta:
      model = Post
      fields = [
         'title',
         'text',
      ]


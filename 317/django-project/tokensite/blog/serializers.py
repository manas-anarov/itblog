from rest_framework import serializers

from rest_framework.serializers import (
      ModelSerializer,
)
from rest_framework.response import Response

from blog.models import Post


class postSerializer(ModelSerializer):
   class Meta:
      model = Post
      fields = ['id',
               'title',
               'text',
               ]

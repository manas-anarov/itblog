from rest_framework import serializers

from django.contrib.auth import get_user_model
from rest_framework.serializers import (
      ModelSerializer,
)
User = get_user_model()


class showProfileSerializer(ModelSerializer):
   class Meta:
      model = User
      fields = [
         'id',
         'username',
         'email',     
      ]

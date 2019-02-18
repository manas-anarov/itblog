from rest_framework import serializers
from rest_framework.serializers import (
	ModelSerializer,
)
from helloworld.models import Post

class updateSerializer(ModelSerializer):
	class Meta:
		model = Post
		fields = [
			'title',
			'text',
		]

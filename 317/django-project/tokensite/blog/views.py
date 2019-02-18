from django.shortcuts import render
from blog.models import Post
from rest_framework.views import APIView
from .serializers import postSerializer
from rest_framework.response import Response

from rest_framework.authentication import TokenAuthentication
from rest_framework.permissions import IsAuthenticated
from rest_framework.authentication import SessionAuthentication

class AllPost(APIView):

	authentication_classes = (TokenAuthentication, SessionAuthentication)
	permission_classes = (IsAuthenticated,)

	
	def get(self, request):
		allpost = Post.objects.order_by('id')
		serializer = postSerializer(allpost, many=True)
		return Response(serializer.data)

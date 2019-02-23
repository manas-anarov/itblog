from django.db import models


from django.contrib.auth.models import AbstractUser
from django.db import models

class MyUser(AbstractUser):
	phone = models.CharField(max_length=250, default='Telephone')
	hobby = models.CharField(max_length=250, default='run')
	def __str__(self):
		return self.username
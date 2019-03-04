from django.db import models

class Post(models.Model):
	title = models.CharField(max_length=400, default=0)
	text = models.CharField(max_length=400, default=0)
	def __str__(self):
		return self.title
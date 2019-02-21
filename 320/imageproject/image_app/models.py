
from django.db import models

class MyImage(models.Model):
	model_pic = models.ImageField(upload_to = '', default = 'none/no-img.jpg')
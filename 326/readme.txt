Android + Django rest application DestroyApiView. Back-end part 1.


cd django-project
source bin/activate


django-admin.py startproject delete_project
cd delete_project
python manage.py startapp delete_app

ip addr

python manage.py runserver 192.168.0.112:8000

http://192.168.0.112:8000/post/delete/1


python manage.py makemigrations
python manage.py migrate

python manage.py createsuperuser

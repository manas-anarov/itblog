Android + Django REST Framework update post

cd django-project
source bin/activate
django-admin.py startproject newproject
cd newproject
python manage.py startapp helloworld

python manage.py makemigrations
python manage.py migrate

python manage.py createsuperuser
python manage.py runserver
http://127.0.0.1:8000/admin/

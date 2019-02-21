Android + Django REST Framework image upload. Backend part 1

cd django-project

source bin/activate


django-admin.py startproject imageproject
cd imageproject

python manage.py runserver

http://127.0.0.1:8000/

python manage.py startapp image_app

python manage.py makemigrations
python manage.py migrate

python manage.py createsuperuser


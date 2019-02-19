cd django-project

source bin/activate


django-admin.py startproject profilesite
cd profilesite

python manage.py runserver

http://127.0.0.1:8000/

python manage.py startapp profile_app

python manage.py makemigrations
python manage.py migrate

python manage.py createsuperuser


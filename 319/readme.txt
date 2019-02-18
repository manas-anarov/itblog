cd django-project

source bin/activate

pip3 install djangorestframework

django-admin.py startproject profilesite
cd profilesite

python manage.py runserver  192.168.0.112:8000

python manage.py startapp profile_app

python manage.py makemigrations
python manage.py migrate

python manage.py createsuperuser


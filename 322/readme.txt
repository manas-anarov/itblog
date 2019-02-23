How to Extend Django User Model

cd django-project

source bin/activate


django-admin.py startproject user_project
cd user_project

python manage.py runserver


python manage.py startapp user_app

python manage.py makemigrations
python manage.py migrate

python manage.py createsuperuser


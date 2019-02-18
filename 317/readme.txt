Token Based Authentication for Django Rest Framework + Android Client. Back-end



cd django-project

source bin/activate

pip3 install djangorestframework

django-admin.py startproject tokensite
cd tokensite

python manage.py runserver  192.168.0.112:8000

python manage.py startapp blog

python manage.py makemigrations
python manage.py migrate

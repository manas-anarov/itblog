Android + Django rest application CreateApiView. Back-end part 1.


cd django-project
source bin/activate


django-admin.py startproject create_project
cd create_project
python manage.py startapp create_app

ip addr

python managey runserver 192.168.0.112:8000

http://192.168.0.112:8000/post/create/


python manage.py makemigrations
python manage.py migrate

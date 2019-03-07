Android, React Native + Django rest application ListAPIView. Back-end part 1.


cd django-project
source bin/activate


django-admin.py startproject my_project
cd my_project
python manage.py startapp my_app

ip addr

python manage.py runserver 192.168.8.101:8000

http://192.168.8.101:8000/post/list
http://192.168.8.101:8000/admin

python manage.py makemigrations
python manage.py migrate

python manage.py createsuperuser

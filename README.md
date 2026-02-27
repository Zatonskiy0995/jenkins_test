# jenkins_test

# Создаем отдельную директорию для хранения конфигурации Jenkins
mkdir ~/jenkins_home

# Запускаем контейнер Jenkins
docker run -d \
           -p 8080:8080 \
           -p 50000:50000 \
           -v ~/jenkins_home:/var/jenkins_home \
           jenkins/jenkins:lts
#выдача прав Jenkins на директорию 
sudo chown -R 1000:1000 /root/jenkins_home


# user
Vasja
p1pFklYMZWAeXSbrAEx5

# проверка прав 
import hudson.model.User
import hudson.model.Hudson

User currentUser = User.current()
boolean isAdmin = currentUser.hasPermission(Hudson.ADMINISTER)

if(isAdmin) {
      println("Пользователь обладает правами администратора.")
} else {
      println("Пользователь не является администратором.")
}
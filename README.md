# jenkins_test

# Создаем отдельную директорию для хранения конфигурации Jenkins
mkdir ~/jenkins_home
# выдача прав Jenkins на директорию 
sudo chown -R 1000:1000 /root/jenkins_home

# Запускаем контейнер Jenkins
docker run -d \
           -p 8080:8080 \
           -p 50000:50000 \
           -v ~/jenkins_home:/var/jenkins_home \
           jenkins/jenkins:lts
# Запускаем контейнер Jenkins c задачей имени
docker run -d \
             --name jenkins_my \
             -p 8080:8080 \
             -p 50000:50000 \
             -v ~/jenkins_home:/var/jenkins_home \
             jenkins/jenkins:lts

# user
Vasja
p1pFklYMZWAeXSbrAEx5

# проверка прав администратора 
import hudson.model.User
import hudson.model.Hudson

User currentUser = User.current()
boolean isAdmin = currentUser.hasPermission(Hudson.ADMINISTER)

if(isAdmin) {
      println("Пользователь обладает правами администратора.")
} else {
      println("Пользователь не является администратором.")
}
# Запускаем контейнер Nginx
docker run -d \
           -p 80:80 \
           ngnix

#Дженкинс закрытый ключ 

-----BEGIN OPENSSH PRIVATE KEY-----
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
-----END OPENSSH PRIVATE KEY-----
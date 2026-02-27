pipeline {
      agent any
      parameters {
          string(name: 'IP_SERVER', defaultValue: '213.183.53.195', description: 'Введите IP адрес сервера')
          string(name: 'DOCKER_CONTAINER', defaultValue: 'objective_bose', description: 'Введите имя Docker-контейнера на сервере ("docker ps")')
      }
      stages {
          stage('Вывод Задачи') {
              steps {
                  echo "Привет, мир! Jenkins работает."
                  echo "IP-адрес сервера: ${params.IP_SERVER}"
                  echo "Имя Docker-контейнера: ${params.DOCKER_CONTAINER}"
              }
          }
          stage('Cleanup') {
              steps {
                  cleanWs()
              }
          }
      }
}
node {
    agent any
    parameters {
        string(name: 'IP_SERVER', defaultValue: '213.183.53.195', description: 'Ведите ip адрес')
        string(name: 'DOCKER_KONTEINER', defaultValue: 'objective_bose', description: 'Ведите имя контейнера на сервере "docker ps"')
    }
    stages {
        stage('Вывод Задачи') {
            steps {
                echo "Привет, мир! Jenkins работает."
                echo "Значение первого параметра: ${params.IP_SERVER}"
                echo "Значение второго параметра: ${params.DOCKER_KONTEINER}"
            }
        }
        stage('Cleanup') {
            steps {
                cleanWs()
            }
        }
    }
}
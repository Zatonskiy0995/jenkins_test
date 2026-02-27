node {
    agent any
        parameters {
            string(name: 'IP_SEREVER', defaultValue: '', description: 'ip сервера')
            string(name: 'DOCER_NAME', defaultValue: '', description: 'Название контейнера')
    }
    stage('Test Stage') {
        // Простое эхо-командование для отображения результата
        echo 'Привет, мир! Jenkins работает.'
        
        // Проверка окружения
        sh 'env'
        sh 'ansible --version'
    }
    
    stage('Cleanup') {
        cleanWs()
    }
}
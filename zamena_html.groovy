node {
    stage('Test Stage') {
        // Простое эхо-командование для отображения результата
        echo 'Привет, мир! Jenkins работает.'
        
        // Проверка окружения
        sh 'env'
    }
    
    stage('Cleanup') {
        cleanWs()
    }
}
node {
      stage('Test Stage') {
          // Простое эхо-командование для отображения результата
          echo 'Привет, мир! Jenkins работает.'
          
          // Проверка окружения
          sh 'env'
      }
      stage('ls -la') {
          // Простое эхо-командование
          echo 'Проверяем пространство Jenkins'
          
          // Проверка окружения ls -la
        sh 'ls -la'
        sh 'git --version'
        sh 'ansible --version'
        
      }
      
      stage('Cleanup') {
          cleanWs()
      }
}
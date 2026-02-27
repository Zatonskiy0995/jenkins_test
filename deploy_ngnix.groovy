pipeline {
    agent any
    parameters {
        string(name: 'PARAMETER_1', defaultValue: '', description: 'Первое вводимое значение')
        string(name: 'PARAMETER_2', defaultValue: '', description: 'Второе вводимое значение')
    }
    stages {
        stage('Test Stage') {
            steps {
                echo "Привет, мир! Jenkins работает."
                echo "Значение первого параметра: ${params.PARAMETER_1}"
                echo "Значение второго параметра: ${params.PARAMETER_2}"
                
                sh 'env'
                sh 'ansible --version'
            }
        }
        stage('Cleanup') {
            steps {
                cleanWs()
            }
        }
    }
}
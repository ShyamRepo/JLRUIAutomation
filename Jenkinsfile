pipeline {
    agent any

    stages {
        stage('building') {
            steps {
                 echo 'build..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn clean install'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
pipeline {
    agent any

	tools
	{
	maven "MAVEN_HOME"
	}
    stages {
        stage('building') {
            steps {
                 echo 'build..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat "mvn clean install"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
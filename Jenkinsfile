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
                bat "mvn clean test"
                emailext body: 'thanks', subject: 'Jenkins report', to: 'dheer.shyam297@gmail.com'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
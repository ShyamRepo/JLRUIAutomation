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
        stage('Testing') {
            steps {
                echo 'Testing..'
                bat "mvn clean test"
                
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                emailext body: 'thanks', subject: 'Jenkins report', to: 'dheer.shyam297@gmail.com'
            }
        }
    }
}
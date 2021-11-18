// Declarative //
pipeline {
    agent any

    stages {
    	stage('Checkout: Code') {
            steps {
                echo 'Pulling...'
                git branch: 'master',
                url : 'https://github.com/tcheagj/Devops',
                credentialsId : 'e17e192c-1a52-4229-bfd5-5c9f367ca028';
            }
        }
        stage('Package creation') {
            steps {
                echo 'Building..'
                bat """mvn -version """
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
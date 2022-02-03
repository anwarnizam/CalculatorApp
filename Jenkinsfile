pipeline {
    agent any 
    stages {
        stage('Clean') {
            steps {
                echo 'Cleaning..'
                bat 'mvn clean'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'mvn install'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying..'
                bat 'mvn war:war deploy:deploy' 
            }
        }
    }
}
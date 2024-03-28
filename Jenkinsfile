pipeline {
    agent any
     tools {
        maven "apache-maven-3.9.6"
        jdk "JDK"
     }
   // checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/JhaRashi/Task6.git']])
    stages {
        stage('Build') {
            steps {
                sh 'mvn initialize'
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                sh 'mvn deploy'
                sh 'curl http://localhost:8080'
            }
        }
    }
    
    post {
        success {
            echo 'Deployment successful'
        }
        failure {
            echo 'Deployment failed'
        }
    }
}

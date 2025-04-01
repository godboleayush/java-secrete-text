def gv

pipeline {
    agent any

    // Define environment variables (general and sensitive ones)
    environment {
        PORT = credentials('PORT')  // 'your-api-key-credential-id' is the ID of the secret stored in Jenkins
    }

    stages {

        stage('init'){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }

        stage('Build') {
             steps {
                script {
                    gv.buildApp()
                }
             }
        }

        stage('Deploy') {
            steps {
                script{
                    gv.deployApp()
                }
            }
        }
    }

    post {
        always {
            // Clean up or notifications, if needed
            echo 'Cleaning up resources'
        }
    }
}

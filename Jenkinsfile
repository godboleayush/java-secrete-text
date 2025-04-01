pipeline {
    agent any

    // Define environment variables (general and sensitive ones)
    environment {
        PORT = credentials('PORT')  // 'your-api-key-credential-id' is the ID of the secret stored in Jenkins
    }

    stages {
        stage('Build') {
             steps {
                script {
                    if (PORT == 8000) {
                        echo "Everything is fine"
                    } else {
                        echo "Port is not 8000, something is not fine"
                    }
                }
             }
        }

        stage('Deploy') {
            steps {
                echo "deploy reached"
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

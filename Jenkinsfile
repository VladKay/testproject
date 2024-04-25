pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from your repository
                git 'https://github.com/VladKay/testproject.git'
            }
        }
        stage('Test') {
            steps {
                // Run tests for the application
                echo 'test'
            }
        }
    }

    post {
        success {
            // Notification or additional steps to execute on success
            echo 'Deployment successful'
        }
        failure {
            // Notification or additional steps to execute on failure
            echo 'Deployment failed'
        }
    }
}

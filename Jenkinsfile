pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                script {
                    checkout scm
                }
            }
        }

        stage('Build') {
            steps {
                // Run the build script
                script {
                    sh 'chmod +x run_microservices.sh'
                    sh './run_microservices.sh'
                }
            }
        }

        // Add more stages as needed (e.g., testing, deployment)
    }
}

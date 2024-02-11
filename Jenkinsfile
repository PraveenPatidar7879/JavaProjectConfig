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
                    sh 'chmod +x bhild_Microservies.sh'
                    sh './bhild_Microservies.sh'
                }
            }
        }

        // Add more stages as needed (e.g., testing, deployment)
    }
}

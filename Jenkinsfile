pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                // Clone the project
                git 'https://github.com/saifmbarki/DevOpsProject.git'
            }
        }
        stage('Build with Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Build Docker Image') {
            steps {
                // Build the Docker image
                sh 'docker build -t saifmbarki/devops-project-image:1.0.0 .'
            }
        }
        stage('Stop and Remove Existing Container') {
            steps {
                script {
                    // Check if the container exists and stop/remove it if it does
                    def containerExists = sh(script: "docker ps -a --filter 'name=devops-project-container' --format '{{.Names}}'", returnStdout: true).trim()
                    if (containerExists == 'devops-project-container') {
                        sh 'docker stop devops-project-container || true'
                        sh 'docker rm devops-project-container || true'
                    }
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                // Run the Docker container
                sh 'docker run -d -p 8090:8080 --name devops-project-container saifmbarki/devops-project-image:1.0.0'
            }
        }
    }
}

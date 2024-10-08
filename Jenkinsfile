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
        stage('Run Tests 100001') {
            steps {
                script {
                	echo " ############## runing test now ......"
                    def result = sh(script: 'mvn test', returnStatus: true)
                    if (result != 0) {
                        currentBuild.result = 'UNSTABLE' // Mark the build as unstable
                        echo "Tests failed, marking build as unstable."
                    }
                }
            }
        }
        //stage('Run Tests') {
        //    steps {
        //        sh 'mvn test' // Execute unit tests
        //        junit '**/target/surefire-reports/*.xml' // Adjust the path as needed for your project
        //   }
        //}
        
        stage('Build Docker Image') {
            steps {
                // Build the Docker image
                sh 'docker build -t saifmbarki/devops-project-image:1.0.0 .'
            }
        }
        stage('Stop and Remove Existing Container') {
            steps {
                script {
                        sh 'docker stop devops-project-container || true'
                        sh 'docker rm devops-project-container || true'
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
    
    
     post {
        always {
            echo "This will run after the pipeline completes."
        }
        success {
            echo "This will run only if the pipeline succeeds."
        }
        unstable {
            echo "This will run if the build is unstable."
        }
        failure {
            echo "This will run if the build fails."
        }
    }
}

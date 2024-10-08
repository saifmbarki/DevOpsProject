# Jenkins CI/CD Pipeline on EC2

This project demonstrates a CI/CD pipeline built using Jenkins deployed on an AWS EC2 instance. The pipeline automatically builds, tests, and deploys a Docker container whenever changes are pushed to the repository.

## Setup Overview

| Component               | Description                                                                 |
|-------------------------|-----------------------------------------------------------------------------|
| **EC2 Instance**         | The jenkins url is: [http://54.81.86.84:8080/](http://54.81.86.84:8080/) |
| **EC2 Instance**         | The app URL is: [http://54.81.86.84:8090/](http://54.81.86.84:8090/) |
| **Jenkins Pipeline**     | The pipeline is triggered by a `git push` event, performs a Maven build, creates a Docker image from the Dockerfile, and runs the image as a container. |
| **Maven**                | Used to build the Java project, compile the code, and run tests.            |
| **Docker**               | Dockerfile is used to create an image after the Maven build. This image is then used to run a container. |
| **Webhook**              | Configured to trigger Jenkins jobs automatically on each `git push`.        |

## CI/CD Pipeline Process

1. **Trigger**: The Jenkins pipeline is triggered whenever code is pushed to the repository.
2. **Build with Maven**: The pipeline runs the following Maven commands to build the project:
   ```bash
   mvn clean package

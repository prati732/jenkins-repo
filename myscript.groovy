
pipeline {
    agent any

    stages {
        stage('pull') {
            steps {
                 https://github.com/prati732/project.git        
            }
        }

        stage('Build') {
            steps {
                echo 'Building..'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

pipeline {
    agent {
        docker { image 'corona_uploader' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'echo "test content" > thing.txt'
                sh 'pwd'
                sh 'python3'
            }
        }
    }
}

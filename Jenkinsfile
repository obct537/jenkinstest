pipeline {
    agent {
        docker { image 'corona_uploader' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'echo "test content" > thing.txt'
                sh 'ls -lah'
                sh 'python3'
            }
        }
    }
}

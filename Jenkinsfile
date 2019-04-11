pipeline {
    agent {
        docker { image 'corona' }
    }
    environment {
        PASSWORD = credentials('samschwa')
    }
    stages {
        stage('Test') {
            steps {
                script {
                    sh 'echo "test content" > thing.txt'
                    sh 'mkdir images'
                    sh 'touch images/a.txt'
                    sh 'touch images/b.txt'
                    def uploader = load "uploader.groovy"

                    uploader.uploader()
                }
            }
        }
    }
}

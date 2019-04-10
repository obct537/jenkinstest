pipeline {
    agent {
        docker { image 'corona_uploader' }
    }
    environment {
        PASSWORD = credentials('samschwa')
    }
    stages {
        stage('Test') {
            steps {
                sh 'echo "test content" > thing.txt'
                sh 'mkdir images'
                sh 'touch images/a.txt'
                sh 'touch images/b.txt'
                json_stuff = "{\"productName\": \"Test Product Name 44\", \"username\": \"samschwa\", \"password\":\"$PASSWORD\", \"images\": [\"thing.txt\", \"images/*.txt\"]}"

                command = "python3 /imageuploader/coronaApiHandler.py --json \"" 
                command += json_stuff
                command += "\""
                sh command
            }
        }
    }
}

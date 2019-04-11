def upload(pw) {
    def json_stuff = "{\"productName\": \"Test Product Name 44\", \"username\": \"samschwa\", \"password\":\"" + pw + "\", \"images\": [\"thing.txt\", \"images/*.txt\"]}"

    def command = 'python3 /imageuploader/coronaApiHandler.py --json "' 
    command += json_stuff
    command += '"'

    sh command

}
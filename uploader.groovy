def upload(pw) {
    def json_stuff = "{\"productName\": \"Test Product Name 44\", \"username\": \"samschwa\", \"password\":\"" + pw + "\", \"images\": [\"thing.txt\", \"images/*.txt\"]}"

    println json_stuff
    def command = 'python3 /imageuploader/coronaApiHandler.py --json "' 
    command += json_stuff
    command += '"'

    println command

    sh command

}

return this
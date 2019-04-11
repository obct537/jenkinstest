import groovy.json.JsonOutput

def upload(pw) {
    def json_stuff = JsonOutput.toJson([productName: "Test Product Name 44", username: "samschwa", password: pw, images: ["thing.txt", "images/*.txt"]])

    println json_stuff
    def command = "python3 /imageuploader/coronaApiHandler.py --json \"$json_stuff\""

    println command

    sh command

}

return this
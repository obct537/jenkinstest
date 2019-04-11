import groovy.json.JsonOutput

def upload(creds) {
    def pw = creds.split(':')[1]
    def json_stuff = JsonOutput.toJson([directory: pwd(), version: '111', productName: "Test Product Name 44", username: "samschwa", password: pw, images: ["thing.txt", "images/*.txt"]])

    def command = "python3 /imageuploader/coronaApiHandler.py --json '$json_stuff'"

    println command

    sh command

}

return this
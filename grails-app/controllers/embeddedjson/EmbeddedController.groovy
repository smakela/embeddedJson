package embeddedjson

class EmbeddedController {

    def index() {
        respond(a: A.first())
    }
}

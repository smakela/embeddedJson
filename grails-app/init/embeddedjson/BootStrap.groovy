package embeddedjson

class BootStrap {

    def init = { servletContext ->
        def c1 = new C(code: "c1", name: "c1")
        def c2 = new C(code: "c2", name: "c2")
        def b1 = new B(code: "b1")
        new A(data: ["key1":"value1", "key2":"value2"], bees: [c1,c2,b1], cees: [c1,c2]).save(flush:true)
    }
    def destroy = {
    }
}

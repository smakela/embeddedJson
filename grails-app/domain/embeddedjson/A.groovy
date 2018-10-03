package embeddedjson

import org.bson.types.ObjectId

class A {

    ObjectId id
    Map<String, Object> data
    List<C> cees
    List<B> bees

    static embedded = ['bees', 'cees']

    static constraints = {
        data(nullable: true)
        cees(nullable: true)
        bees(nullable: true)
    }
}

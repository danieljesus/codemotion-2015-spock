package codemotion2015

import spock.lang.Specification

class E6_Lifecycle extends Specification {

    //Al principio una sola vez
    def setupSpec() {
        println '> setupSpec'
    }

    //Antes de cada test
    def setup() {
        println '>> setup'
    }

    //Después de cada test
    def cleanup() {
        println '>> cleanup'
    }

    //Al final una sola vez
    def cleanupSpec() {
        println '> cleanSpec'
    }

    void 'test'() {
        expect:
            println '>>> test'
    }

    void 'test 2'() {
        expect:
            println '>>> test 2'
    }

}

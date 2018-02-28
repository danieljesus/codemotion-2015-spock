package codemotion2015

import spock.lang.Shared
import spock.lang.Specification

class E7_Shared extends Specification {

//    @Shared
    def person = new Person('Iván', 'López')

//    def setupSpec(){
//        def person = new Person('Iván', 'López')
//    }

    void 'should get name'() {
        given:
            println person

        expect:
            person.name == 'Iván'
    }

    void 'should get lastName'() {
        given:
            println person

        expect:
            person.lastName == 'López'
    }

}

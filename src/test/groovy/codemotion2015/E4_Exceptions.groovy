package codemotion2015

import spock.lang.Specification

class E4_Exceptions extends Specification {

    void 'should throw an exception'() {
        when:
            Long.valueOf("foo")

        then:
            thrown NumberFormatException

//            def e = thrown NumberFormatException
//            e.message == 'For input string: "foo"'
    }

    void 'should not throw an exception'() {
        when:
        Long.valueOf("123")

        then:
            notThrown(NumberFormatException)
    }
}

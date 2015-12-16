package D8;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

public class UnfairSupermarketTest {
    UnfairSupermarket usp;
    Class c ;

    @Before
    public void setUp(){
        usp = new UnfairSupermarket();
        c = usp.getClass();
    }


    @Test
    public void testRetrieve() throws Exception {
        usp.addPerson(new Person(32,"male","Peter"));
        usp.addPerson(new Person(21, "male", "Tom"));
        usp.addPerson(new Person(45, "female", "Linda"));
        usp.addPerson(new Person(12,"male","Johns"));
        usp.addPerson(new Person(29, "female", "Sara"));
// private method test using reflection
        Method listQ = c.getDeclaredMethod("listTheQueue",null);
        listQ.setAccessible(true);
        listQ.invoke(usp);
// ****************************************
        usp.servePerson();
        usp.servePerson();
        usp.servePerson();
        usp.servePerson();
        usp.servePerson();

    }


}
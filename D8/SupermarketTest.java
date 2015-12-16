package D8;

import org.junit.Before;
import org.junit.Test;


public class SupermarketTest {
    Supermarket store;

    @Before
    public void setUp(){
        store = new Supermarket();
    }

    @Test
    public void testSupermarket() throws Exception {
        store.addPerson(new Person(32,"male","Peter"));
        store.addPerson(new Person(21,"male","Bela"));
        store.addPerson(new Person(45,"female","Linda"));
        store.listTheQueue();
        store.servePerson();
        store.addPerson(new Person(12,"male","Geza"));
        store.addPerson(new Person(29,"female","Gizi"));
        store.servePerson();
        store.servePerson();
        store.listTheQueue();

    }


}
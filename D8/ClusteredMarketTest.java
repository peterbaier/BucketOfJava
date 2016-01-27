package D8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClusteredMarketTest {
    ClusteredMarket cm;

    @Before
    public void setUp(){
      cm = new ClusteredMarket();
    }


    @Test
    public void testRetrieve() throws Exception {
        cm.addPerson(new Person(65, "male", "Peter"));
        cm.addPerson(new Person(19, "male", "Tom"));
        cm.addPerson(new Person(12, "female", "Linda"));
        cm.addPerson(new Person(70, "male", "Johns"));
        cm.addPerson(new Person(22, "female", "Sara"));
        assertEquals("Peter",cm.retrieve().getName());
        assertEquals("Johns",cm.retrieve().getName());
        assertEquals("Tom",cm.retrieve().getName());
        assertEquals("Sara",cm.retrieve().getName());
        assertEquals("Linda",cm.retrieve().getName());
    }


    @Test
    public void insertTest(){

    }

}
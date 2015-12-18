package Maps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lion on 18/12/2015.
 */
public class SpecMapTest {
    SpecMap sm;
    @Before
    public void setUp() throws Exception {
        sm = new SpecMap();
    }

    @After
    public void tearDown() throws Exception {
        sm = null;
    }

    @Test
    public void testPut() throws Exception {
        sm.put(123,"first");
        sm.put(456,"second");
        sm.put(789,"third");
    }

    @Test
    public void testGet() throws Exception {
        assertEquals("second",sm.get(456));
    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testIsEmpty() throws Exception {

    }
}
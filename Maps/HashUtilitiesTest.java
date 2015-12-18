package Maps;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;


public class HashUtilitiesTest {


    @Test
    public void testShortHash() throws Exception {
        String a = "This is a string";
        int ashash = a.hashCode();
        int myhash = HashUtilities.shortHash(ashash);
        assertNotEquals(ashash,myhash);
        assertTrue(myhash > 0 && myhash < 1000);
        System.out.println(ashash);
        System.out.println(myhash);
    }
}
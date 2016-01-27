package D8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {

    BinaryTree tree;


    @Test
    public void insert1numberTest(){
        tree.insert(new Number(6));
        assertEquals(6,tree.getNumberTree().getNumber());
    }

    @Test
    public void insert2numberTest(){
        int[] expected = new int[]{6,3};
        tree.insert(new Number(6));
        tree.insert(new Number(3));
        assertEquals(expected, );
    }

    @Before
    public void setUp() throws Exception {
        tree = new BinaryTree();
    }

    @After
    public void tearDown() throws Exception {
        tree = null;

    }
}
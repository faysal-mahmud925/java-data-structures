package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyBSTTest {
    @Test
    void addContains() {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        bst.add(4); bst.add(2); bst.add(6);
        assertTrue(bst.contains(2));
        assertFalse(bst.contains(5));
    }
}

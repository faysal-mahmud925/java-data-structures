package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    @Test
    void addRemoveFirstSize() {
        MyLinkedList<String> l = new MyLinkedList<>();
        l.add("x"); l.add("y");
        assertEquals(2, l.size());
        assertEquals("x", l.removeFirst());
        assertEquals(1, l.size());
    }
}

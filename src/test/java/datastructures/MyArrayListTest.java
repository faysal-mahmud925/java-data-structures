package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    @Test
    void addGetRemoveSize() {
        MyArrayList<Integer> a = new MyArrayList<>();
        assertEquals(0, a.size());
        a.add(10); a.add(20);
        assertEquals(2, a.size());
        assertEquals(10, a.get(0));
        assertEquals(20, a.remove(1));
        assertEquals(1, a.size());
    }
}

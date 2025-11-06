package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyHashMapTest {
    @Test
    void putGetSize() {
        MyHashMap<String,Integer> m = new MyHashMap<>();
        assertEquals(0, m.size());
        m.put("k1", 1); m.put("k2", 2);
        assertEquals(2, m.size());
        assertEquals(2, m.get("k2"));
    }
}

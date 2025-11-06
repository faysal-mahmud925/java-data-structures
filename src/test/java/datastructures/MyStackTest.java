package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    @Test
    void pushPopPeek() {
        MyStack<Integer> s = new MyStack<>();
        s.push(1); s.push(2);
        assertEquals(2, s.peek());
        assertEquals(2, s.pop());
        assertEquals(1, s.pop());
    }
}

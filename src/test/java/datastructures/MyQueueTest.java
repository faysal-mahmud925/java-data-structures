package datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    @Test
    void offerPollSize() {
        MyQueue<Integer> q = new MyQueue<>();
        q.offer(5); q.offer(6);
        assertEquals(5, q.poll());
        assertEquals(6, q.poll());
        assertNull(q.poll());
    }
}

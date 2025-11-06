package datastructures;

import java.util.Iterator;
public class MyLinkedList<T> implements Iterable<T> {
    private static class Node<T> { T val; Node<T> next; Node(T v){val=v;} }
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public void add(T value) {
        Node<T> n = new Node<>(value);
        if (head == null) head = tail = n;
        else { tail.next = n; tail = n; }
        size++;
    }

    public T removeFirst() {
        if (head == null) throw new RuntimeException("Empty list");
        T v = head.val;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return v;
    }

    public int size() { return size; }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> cur = head;
            public boolean hasNext() { return cur != null; }
            public T next() { T v = cur.val; cur = cur.next; return v; }
        };
    }
}

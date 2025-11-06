package datastructures;

public class MyQueue<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();

    public void offer(T v) { list.add(v); }

    public T poll() {
        try { return list.removeFirst(); }
        catch (RuntimeException e) { return null; }
    }

    public int size() { return list.size(); }
}

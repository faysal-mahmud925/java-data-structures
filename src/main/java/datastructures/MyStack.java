package datastructures;

public class MyStack<T> {
    private MyArrayList<T> list = new MyArrayList<>();

    public void push(T v) { list.add(v); }

    public T pop() {
        if (list.size() == 0) throw new RuntimeException("Stack empty");
        return list.remove(list.size()-1);
    }

    public T peek() {
        if (list.size() == 0) throw new RuntimeException("Stack empty");
        return list.get(list.size()-1);
    }

    public int size() { return list.size(); }
}

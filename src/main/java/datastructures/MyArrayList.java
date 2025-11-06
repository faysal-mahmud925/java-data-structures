package datastructures;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
    private Object[] data;
    private int size = 0;
    private static final int DEFAULT_CAP = 10;

    public MyArrayList() { this.data = new Object[DEFAULT_CAP]; }

    public void add(T value) {
        ensureCapacity(size + 1);
        data[size++] = value;
    }

    public T get(int index) {
        rangeCheck(index);
        return (T) data[index];
    }

    public T remove(int index) {
        rangeCheck(index);
        T old = (T) data[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) System.arraycopy(data, index+1, data, index, numMoved);
        data[--size] = null;
        return old;
    }

    public int size() { return size; }

    private void ensureCapacity(int minCap) {
        if (minCap > data.length) {
            int newCap = data.length + (data.length >> 1);
            if (newCap < minCap) newCap = minCap;
            data = Arrays.copyOf(data, newCap);
        }
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("" + index);
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cursor = 0;
            public boolean hasNext() { return cursor < size; }
            public T next() { return (T) data[cursor++]; }
        };
    }
}

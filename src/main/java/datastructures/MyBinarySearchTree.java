package datastructures;

public class MyBinarySearchTree<T extends Comparable<T>> {
    private static class Node<T>{ T v; Node<T> left, right; Node(T v){this.v=v;} }
    private Node<T> root;

    public void add(T v) { root = add(root, v); }

    private Node<T> add(Node<T> n, T v) {
        if (n == null) return new Node<>(v);
        int c = v.compareTo(n.v);
        if (c < 0) n.left = add(n.left, v);
        else if (c > 0) n.right = add(n.right, v);
        return n;
    }

    public boolean contains(T v) { return contains(root, v); }
    private boolean contains(Node<T> n, T v) {
        if (n == null) return false;
        int c = v.compareTo(n.v);
        if (c == 0) return true;
        return c < 0 ? contains(n.left, v) : contains(n.right, v);
    }
}

package datastructures;

public class Main {
    public static void main(String[] args) {
        System.out.println("Demo: Java Data Structures");

        MyArrayList<Integer> arr = new MyArrayList<>();
        arr.add(1); arr.add(2); arr.add(3);
        System.out.println("ArrayList size: " + arr.size() + ", get(1)=" + arr.get(1));

        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a"); list.add("b");
        System.out.print("LinkedList: ");
        for (String s : list) System.out.print(s+" ");
        System.out.println();

        MyStack<Integer> stack = new MyStack<>();
        stack.push(10); stack.push(20);
        System.out.println("Stack pop: " + stack.pop());

        MyQueue<Integer> q = new MyQueue<>();
        q.offer(5); q.offer(6);
        System.out.println("Queue poll: " + q.poll());

        MyHashMap<String,Integer> map = new MyHashMap<>();
        map.put("one", 1); map.put("two", 2);
        System.out.println("Map get two: " + map.get("two"));

        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        bst.add(5); bst.add(3); bst.add(7);
        System.out.println("BST contains 3: " + bst.contains(3));
    }
}

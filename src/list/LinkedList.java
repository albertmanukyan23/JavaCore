package list;

public class LinkedList {
    private Node root = null;
    private Node tail = null;
    private Node checker;

    class Node {
        int value;
        Node prev;
        Node next;
    }

    public void add(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (root == null) {
            root = tail = newNode;
            tail.next = null;
            root.prev = null;
            checker = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next = null;
    }

    // recursion way
    public void print() {
        if (root == null) {
            System.out.println("list es empty");
            return;
        }
        System.out.print(checker.value + " ");
        if (checker.next == null) {
            checker = root;
            System.out.println();
            return;
        }
        checker = checker.next;
        print();
    }

}

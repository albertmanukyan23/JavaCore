package list;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(48);
        linkedList.add(48);
        linkedList.add(48);
        linkedList.add(0);
        linkedList.print();
        linkedList.add(1);
        linkedList.delete(0);
        linkedList.print();
        linkedList.add(7);
        linkedList.print();
        linkedList.delete(7);
        linkedList.print();
        linkedList.add(8);
        linkedList.print();
        linkedList.delete(1);
        linkedList.print();
        linkedList.add(0);
        linkedList.print();

    }
}

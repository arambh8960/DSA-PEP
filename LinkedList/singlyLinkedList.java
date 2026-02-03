// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedList {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add at given position (0-based index)
    public void addAtPosition(int pos, int data) {

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        // insert at start
        if (pos == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;

        // move to pos-1
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        // update tail if last position
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Print linked list
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);

        ll.print(); // 4 -> 3 -> 2 -> 1 -> null

        ll.addAtPosition(2, 99);
        ll.print(); // 4 -> 3 -> 99 -> 2 -> 1 -> null

        ll.addAtPosition(0, 100);
        ll.print(); // 100 -> 4 -> 3 -> 99 -> 2 -> 1 -> null

        ll.addAtPosition(ll.size, 200);
        ll.print(); // 100 -> 4 -> 3 -> 99 -> 2 -> 1 -> 200 -> null
    }
}

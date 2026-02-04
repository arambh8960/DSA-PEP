class CircularLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        // empty list
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // circular link
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head; // maintain circular link
    }

    // Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        // empty list
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head; // circular link
    }

    // Add at given position (0-based index)
    public void addAtPosition(int pos, int data) {

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            addFirst(data);
            return;
        }

        if (pos == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print Circular Linked List
    public void print() {
        if (head == null) {
            System.out.println("CLL is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Main method
    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.addFirst(10);
        cll.addFirst(20);
        cll.addLast(30);
        cll.addLast(40);

        cll.print();
        // 20 -> 10 -> 30 -> 40 -> (back to head)

        cll.addAtPosition(2, 99);
        cll.print();
        // 20 -> 10 -> 99 -> 30 -> 40 -> (back to head)
    }
}

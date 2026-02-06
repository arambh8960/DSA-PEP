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
            tail.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
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
        tail.next = head;
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

    // Delete last node
    public void deleteLast() {

        // empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // only one node
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;

        // go to node before tail
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
        size--;
    }

    // Print circular linked list
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

        cll.deleteLast();
        cll.print();
        // 20 -> 10 -> 99 -> 30 -> (back to head)
    }
}

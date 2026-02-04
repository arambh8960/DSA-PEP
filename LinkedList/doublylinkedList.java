
class DoublyLinkedList {

    // Node class
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            this.data = val;
            this.next = null;
            this.prev = null;
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
        head.prev = newNode;
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

        // insert at end
        if (pos == size) {
            Node newNode = new Node(data);
            size++;

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
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
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Print linked list (forward)
    public void print() {
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Print linked list (reverse)
    public void printReverse() {
        if (tail == null) {
            System.out.println("DLL is empty");
            return;
        }

        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);

        dll.print(); 
        // 4 <-> 3 <-> 2 <-> 1 <-> null

        dll.addAtPosition(2, 99);
        dll.print(); 
        // 4 <-> 3 <-> 99 <-> 2 <-> 1 <-> null

        dll.addAtPosition(0, 100);
        dll.print(); 
        // 100 <-> 4 <-> 3 <-> 99 <-> 2 <-> 1 <-> null

        dll.addAtPosition(dll.size, 200);
        dll.print(); 
        // 100 <-> 4 <-> 3 <-> 99 <-> 2 <-> 1 <-> 200 <-> null

        dll.printReverse();
        // 200 <-> 1 <-> 2 <-> 99 <-> 3 <-> 4 <-> 100 <-> null
    }
}

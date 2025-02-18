public class LinkedList {

    // Inner class representing a node in the linked list
    static class Node {
        String data;  // Data stored in the node
        Node next;    // Reference to the next node in the list

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Head of the list

    // 1. Adding to the front of the list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // 2. Adding to the end of the list
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // 3. Deleting the first node
    public void deleteFirst() {
        if (head == null) {
            return; // List is empty
        }
        head = head.next;
    }

    // 4. Deleting the last node
    public void deleteLast() {
        if (head == null) {
            return; // List is empty
        }

        if (head.next == null) {
            head = null; // Only one node in the list
            return;
        }

        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
    }

    // 5. Printing the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 6. Get Size of linkedlist
    public int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    //Main class
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements
        list.addFirst("Item3");
        list.addFirst("Item2");
        list.addFirst("Item1");
        list.addLast("Item4");

        // Print the list
        System.out.println("Linked List:");
        list.printList();

        //Delete First
        list.deleteFirst();
        System.out.println("Linked List after deleting first Node:");
        list.printList();

        //Delete Last
        list.deleteLast();
        System.out.println("Linked List after deleting last Node:");
        list.printList();

        //Get Size
        int size = list.getSize();
        System.out.println("Size of Linked List:"+ size);

    }
}

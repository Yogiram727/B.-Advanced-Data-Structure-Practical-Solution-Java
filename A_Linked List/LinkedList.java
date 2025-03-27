
/*
 * Linked List in Java
 * -------------------
 * A linked list is a linear data structure where elements (nodes) are stored in memory dynamically.
 * Each node contains two parts:
 *  1. Data: Stores the actual value.
 *  2. Next: A reference (pointer) to the next node in the sequence.
 * 
 * Types of Linked Lists:
 *  - Singly Linked List: Each node points to the next node only.
 *  - Doubly Linked List: Each node points to both the next and previous nodes.
 *  - Circular Linked List: The last node connects back to the first node.
 * 
 * Advantages:
 *  - Dynamic size allocation (efficient memory usage).
 *  - Insertions and deletions are easier compared to arrays.
 * 
 * Disadvantages:
 *  - Extra memory is needed for pointers.
 *  - Random access is not possible (linear search is required).
 * 
 * Common Operations:
 *  - Insertion (at head, tail, or specific position)
 *  - Deletion (from head, tail, or specific position)
 *  - Traversal (iterating through nodes)
 *  - Searching (finding a node with a specific value)
 * 
 * Real-Life Applications in Software Development:
 *  1. **Music Playlists**: Songs are linked, and users can move forward or backward.
 *  2. **Undo/Redo Functionality**: In text editors or software like Photoshop, previous states are stored using a linked list.
 *  3. **Web Browsers (Back & Forward Navigation)**: Browsers store visited web pages using a doubly linked list.
 *  4. **Memory Management**: Operating systems use linked lists to manage memory allocation (e.g., free and used memory blocks).
 *  5. **Scheduling Algorithms**: OS process scheduling (Round Robin) uses a circular linked list.
 *  6. **Social Media Feeds**: Posts and updates are often stored and managed using linked lists for efficient insertion and removal.
 */

import java.util.Scanner;

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    void insertAfter(int prev, int newValue) {
        Node current = head; // Current points to the same memory location as head
        while (current != null && current.data != prev) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Value not found");
        } else {

            Node newNode = new Node(newValue);
            newNode.next = current.next;
            current.next = newNode;
        }

    }

    public void delStart() {
        if (head == null) {

            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    public void delEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node last = head;
            Node secondLast = null;
            while (last.next != null) {
                secondLast = last;
                last = last.next;
            }
            secondLast.next = null;

        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements to insert into the list: \n");
        for (int i = 0; i < 5; i++) {
            int value = sc.nextInt();
            list.insertAtFirst(value);
            // list.insertAtEnd(value);
        }
        System.out.println("\nGiven Linked List");
        list.display();

        System.out.println("\nEnter the value after which you want to insert a new value");
        int prev = sc.nextInt();

        System.out.println("\nEnter the new value that you want to insert");
        int new_value = sc.nextInt();
        list.insertAfter(prev, new_value);

        System.out.println("\nList after insertion");
        list.display();

        list.delStart();
        System.out.println("\nList after deletion of first element");
        list.display();

        list.delEnd();
        System.out.println("\nList after deletion of last element");
        list.display();

        sc.close();
    }
}

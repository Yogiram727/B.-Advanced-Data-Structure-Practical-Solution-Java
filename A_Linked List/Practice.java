import java.util.Scanner;

public class Practice {
    public class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    Node head = null;

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(int value) {
        Node newNode = new Node(value);
        newNode.next = null;

        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void insertAfter(int prev, int value) {
        Node current = null;
        while (current != null && current.data != prev) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node not found");
            return;
        }

        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;

    }
}

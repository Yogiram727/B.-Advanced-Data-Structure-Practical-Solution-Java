import java.util.Scanner;

public class LinkedListPractice {
    class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    private Node head;

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtLast(int value) {
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

    public void insertAfter(int prev, int newValue) {
        Node current = head;
        while (current != null && current.data != prev) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Element not found");
            return;
        }
        Node newNode = new Node(newValue);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void delStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
        }
    }

    public void delEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node last = head;
        Node secondLast = null;
        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }
        secondLast.next = null;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Five element to insert in the list");
        for (int i = 0; i < 5; i++) {
            int value = sc.nextInt();
            // list.insertAtFirst(value);
            list.insertAtLast(value);
        }
        System.out.println("\nGiven Linked List: ");
        list.display();

        System.out.println("\nEnter after which element you want to insert a value");
        int prev = sc.nextInt();

        System.out.println("\nEnter the new value that you want to insert");
        int newValue = sc.nextInt();

        list.insertAfter(prev, newValue);

        list.delStart();
        System.out.println("\nList after deletion of the first element");
        list.display();

        list.delEnd();
        System.out.println("\nList after deletion of the last element");
        list.display();

    }
}
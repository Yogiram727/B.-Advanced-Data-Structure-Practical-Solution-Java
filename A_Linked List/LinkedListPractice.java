import java.util.Scanner;

public class LinkedListPractice {

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
        Node last = null;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void insertAfter(int prev, int newValue) {
        Node current = head;
        while (current != null && current.data != prev) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node not found");
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
        head = head.next;
    }

    public void delEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
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

        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListPractice list = new LinkedListPractice();
        int value, newValue, prev;
        System.out.println("Enter any five element in the list");
        for (int i = 0; i < 5; i++) {
            value = sc.nextInt();
            list.insertAtFirst(value);
            // list.insertAtLast(value);
        }

        System.out.println("Given List ");
        list.display();

        System.out.println("Enter after which Number you want to insert a new one");
        prev = sc.nextInt();

        System.out.println("Enter the new number that you want to insert");
        newValue = sc.nextInt();

        System.out.println("List after insertion of the new Value");
        list.insertAfter(prev, newValue);
        list.display();

        System.out.println("List after deletion of the first value");
        list.delStart();
        list.display();

        System.out.println("List after deletion of the last value");
        list.delEnd();
        list.display();

    }
}
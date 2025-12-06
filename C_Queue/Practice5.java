package C_Queue;

public class Practice5 {

    public class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    Node front = null, rear = null;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
            rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

    public void dqueue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        if (rear == front) {
            rear = null;
            front = null;
        } else {
            front = front.next;
            rear.next = front;
        }
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node ptr = front;
        do {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        } while (ptr != front);
        System.out.println();

    }

    public static void main(String[] args) {
        Practice5 qu = new Practice5();
        qu.enqueue(4);
        qu.enqueue(6);
        qu.enqueue(7);
        qu.enqueue(8);
        qu.enqueue(9);
        System.out.println("Given Queue: ");
        qu.display();
        System.out.println("Queue after partial deletion: ");
        qu.dqueue();
        qu.dqueue();
        qu.display();
        System.out.println("Queue after full deletion: ");
        qu.dqueue();
        qu.dqueue();
        qu.dqueue();
        qu.display();
        System.out.println();
    }
}

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

    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;

        }

        if (front == rear) {
            front = null;
            rear = null;
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
        Practice5 q = new Practice5();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(8);
        System.out.println("Given Queue: ");
        q.display();
        System.out.println("Queue  after partial deletion");
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
        System.out.println("Queue after full deletion: ");
        q.dequeue();
        q.dequeue();
        q.display();
        System.out.println();
    }
}

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
        Practice5 que = new Practice5();
        que.enqueue(4);
        que.enqueue(5);
        que.enqueue(6);
        que.enqueue(7);
        que.enqueue(8);
        System.out.println("Given Queue: ");
        que.display();
        System.out.println("Queue after partial deletion: ");
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.display();
        System.out.println("Queue after full deletion: ");
        que.dequeue();
        que.dequeue();
        que.display();
        System.out.println();
    }
}

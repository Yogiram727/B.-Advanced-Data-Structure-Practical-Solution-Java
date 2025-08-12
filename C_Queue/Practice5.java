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
            rear = newNode;
            front = newNode;
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
        Practice5 que = new Practice5();
        que.enqueue(11);
        que.enqueue(33);
        que.enqueue(44);
        que.enqueue(55);
        que.enqueue(2);
        System.out.println("Given Queue: ");
        que.display();
        System.out.println("Queue after partial deletion: ");
        que.dequeue();
        que.dequeue();
        que.display();
        System.out.println("Queue after full deletion: ");
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.display();
        System.out.println();

    }
}

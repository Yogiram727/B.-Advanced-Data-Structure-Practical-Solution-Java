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
            front = front.next;
            rear.next = front;
        }
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is emtpy");
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
        Practice4 que = new Practice4();
        que.enqueue(3);
        que.enqueue(5);
        que.enqueue(7);
        que.enqueue(8);
        que.enqueue(9);
        System.out.println("Given Queue:");
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
    }
}

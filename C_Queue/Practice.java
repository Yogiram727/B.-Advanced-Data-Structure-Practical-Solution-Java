package C_Queue;

public class Practice {
    public class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    Node rear = null, front = null;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        newNode.next = null;
        if (front == null) {
            front = newNode;
            rear = newNode;
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
            System.out.println(" Queue is empty");
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
        Practice qu = new Practice();
        qu.enqueue(111);
        qu.enqueue(222);
        qu.enqueue(333);
        qu.enqueue(444);
        qu.enqueue(555);
        System.out.println("Given Queue: ");
        qu.display();
        System.out.println("Queue after partial deletion");
        qu.dequeue();
        qu.dequeue();
        qu.display();
        System.out.println("Queue after full deletion");
        qu.dequeue();
        qu.dequeue();
        qu.display();

    }
}

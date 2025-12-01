package C_Queue;

public class Practice5 {

    public class Node {
        int data;
        Node next;

        Node(int item) {
            this.data = item;
            this.next = null;
        }
    }

    Node front = null, rear = null;

    public void enqueu(int value) {
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
        Practice5 qu = new Practice5();
        qu.enqueu(5);
        qu.enqueu(6);
        qu.enqueu(8);
        qu.enqueu(9);
        qu.enqueu(10);
        System.out.println("Given Queue: ");
        qu.display();
        System.out.println("Queue after partial deletion: ");
        qu.dequeue();
        qu.dequeue();
        qu.display();
        System.out.println("Queue after full deletioN: ");
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        qu.display();
        System.out.println();
    }
}

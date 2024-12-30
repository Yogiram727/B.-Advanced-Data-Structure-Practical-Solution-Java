package C_Queue;

public class Practice {

    class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

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
        Practice obj = new Practice();
        obj.enqueue(1010);
        obj.enqueue(343);
        obj.enqueue(342);
        obj.enqueue(999);
        obj.enqueue(34123);
        System.out.println("Given Queue");
        obj.display();
        System.out.println("Queue after partial deletion");
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.display();
        System.out.println("Queue after full deletion");
        obj.dequeue();
        obj.dequeue();
        obj.display();
    }
}

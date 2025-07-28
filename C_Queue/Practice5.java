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

    public void enqueue(int item) {
        Node newNode = new Node(item);
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
        qu.enqueue(34);
        qu.enqueue(45);
        qu.enqueue(66);
        qu.enqueue(89);
        qu.enqueue(32);
        System.out.println("Given Queue: ");
        qu.display();
        System.out.println("Queue after partial deletion: ");
        qu.dequeue();
        qu.dequeue();
        qu.display();
        System.out.println("Queue after full deletion: ");
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        qu.display();
    }
}

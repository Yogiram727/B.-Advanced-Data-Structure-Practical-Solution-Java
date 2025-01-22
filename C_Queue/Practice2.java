package C_Queue;

public class Practice2 {
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
            rear = newNode;
            front = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
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
    }

    public static void main(String[] args) {
        Practice qu = new Practice();
        qu.enqueue(11);
        qu.enqueue(22);
        qu.enqueue(33);
        qu.enqueue(44);
        qu.enqueue(55);
        System.out.println("Given Queue : ");
        qu.display();
        System.out.println("Queue after partial deletion ");
        qu.dequeue();
        qu.dequeue();
        qu.display();
        System.out.println("Queue after full deletion");
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        qu.display();
    }
}

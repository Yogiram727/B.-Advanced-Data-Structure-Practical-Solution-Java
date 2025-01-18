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
            System.out.println("Queue is emtpy");
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
        Practice qq = new Practice();
        qq.enqueue(1);
        qq.enqueue(2);
        qq.enqueue(3);
        qq.enqueue(4);
        qq.enqueue(5);
        System.out.println("Given Queue: ");
        qq.display();
        System.out.println("Queue after partial deletion");
        qq.dequeue();
        qq.dequeue();
        qq.display();
        System.out.println("Queue after full deletion");
        qq.dequeue();
        qq.dequeue();
        qq.dequeue();
        qq.display();

    }
}

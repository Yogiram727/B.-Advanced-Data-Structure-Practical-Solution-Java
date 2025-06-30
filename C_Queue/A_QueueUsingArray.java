package C_Queue;

public class A_QueueUsingArray {
    int rear = -1, front = -1;
    int n;
    int[] queue;

    A_QueueUsingArray(int size) {
        this.n = size;
        queue = new int[n];
    }

    public void enqueue(int value) {
        if ((rear + 1) % n == front) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == -1) {
            rear = 0;
            front = 0;
        } else {
            rear = (rear + 1) % n;
        }

        queue[rear] = value;
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % n;
        }

    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % n;
        } while (i != (rear + 1) % n);
        System.out.println();
    }

    public static void main(String[] args) {
        A_QueueUsingArray que = new A_QueueUsingArray(5);

        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);
        System.out.println("Queue elements : ");
        que.display();
        System.out.println("Queue after partial deletion: ");

        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.display();

        System.out.println("Queue after full deletion");
        que.dequeue();
        que.dequeue();
        que.display();

    }
}
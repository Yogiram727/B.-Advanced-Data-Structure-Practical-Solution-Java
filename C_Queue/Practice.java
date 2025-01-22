package C_Queue;

public class Practice {
    int queue[], front, rear, n;

    Practice() {
        this.front = -1;
        this.rear = -1;
        this.n = 5;
        queue = new int[n];
    }

    public void enqueue(int item) {
        if ((rear + 1) % n == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            rear = 0;
            front = 0;
        } else {
            rear = (rear + 1) % n;
        }
        queue[rear] = item;
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue is emtpy");
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
            System.out.println("Queue is emtpy");
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
        Practice qu = new Practice();
        qu.enqueue(11);
        qu.enqueue(22);
        qu.enqueue(33);
        qu.enqueue(44);
        qu.enqueue(55);
        System.out.println("Given Queue : ");
        qu.display();
        System.out.println("Queue after partial deletion");
        qu.dequeue();
        qu.dequeue();
        qu.dequeue();
        qu.display();
        System.out.println("Queue after full deletion");
        qu.dequeue();
        qu.dequeue();
        qu.display();
    }

}

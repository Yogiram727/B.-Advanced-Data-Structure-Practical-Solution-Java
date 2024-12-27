package B_Stack;

public class Practice {

    public class Node {
        int data;
        Node next;

        Node(int item) {
            this.data = item;
            this.next = null;
        }
    }

    Node top = null;

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        top = top.next;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node ptr = top;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        obj.push(10);
        obj.push(20);
        obj.push(90);
        obj.push(300);

        System.out.println("Given Stack: ");
        obj.display();

        System.out.println("Stack after partial deletion");
        obj.pop();
        obj.pop();
        obj.display();

        System.out.println("Stack after full deletion");
        obj.pop();
        obj.pop();
        obj.display();

    }
}


public class B_StackUsingLinkedList {
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
            System.out.println("Stack is emtpy");
            return;
        }

        Node ptr = top;
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    public static void main(String[] args) {
        B_StackUsingLinkedList stack = new B_StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack before deletion:");
        stack.display();
        System.out.println("Stack after partial deletion");
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("Stack after fully deletion");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }

}

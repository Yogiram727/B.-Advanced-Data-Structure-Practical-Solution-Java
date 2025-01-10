package B_Stack;

public class Practice {

    public class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
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
        Practice stk = new Practice();
        stk.push(223);
        stk.push(999);
        stk.push(343);
        stk.push(1111);
        stk.push(000);
        System.out.println("Given Stack: ");
        stk.display();
        System.out.println("Stack after partial deletion");
        stk.pop();
        stk.pop();
        stk.pop();
        stk.display();
        System.out.println("Stack after full deletion");
        stk.pop();
        stk.pop();
        stk.display();
    }
}

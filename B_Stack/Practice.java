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

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        top = top.next;
    }

    public static void main(String[] args) {
        Practice stk = new Practice();
        stk.push(11);
        stk.push(99);
        stk.push(88);
        stk.push(77);
        stk.push(66);
        System.out.println("Given Stack: ");
        stk.display();
        System.out.println("Stack after partial deletion");
        stk.pop();
        stk.pop();
        stk.display();
        System.out.println("Stack after full deletion");
        stk.pop();
        stk.pop();
        stk.pop();
        stk.display();
    }
}

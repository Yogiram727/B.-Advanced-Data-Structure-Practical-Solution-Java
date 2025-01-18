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

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is emtpy");
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
        Practice stk = new Practice();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(44);
        stk.push(66);
        System.out.println("Given Stack: ");
        stk.display();
        System.out.println("Stack after parital deletion");
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

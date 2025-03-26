package B_Stack;

public class Practice2 {

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
        Practice2 stk = new Practice2();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        System.out.println("Given Stack");
        stk.display();
        System.out.println("Stack after partial Deletion");
        stk.pop();
        stk.pop();
        stk.pop();
        stk.display();

        System.out.println("Stack after full Deletion");
        stk.pop();
        stk.pop();
        stk.display();
    }
}

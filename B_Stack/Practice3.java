public class Practice3 {

    public class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
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
        System.out.println();

    }

    public static void main(String[] args) {
        Practice3 stk = new Practice3();
        stk.push(5);
        stk.push(6);
        stk.push(7);
        stk.push(8);
        stk.push(9);
        System.out.println("Given Stack: ");
        stk.display();
        System.out.println("Stack after partial deletion: ");
        stk.pop();
        stk.pop();
        stk.display();
        System.out.println("Stack after full deletion: ");
        stk.pop();
        stk.pop();
        stk.pop();
        stk.display();
        System.out.println();
    }
}

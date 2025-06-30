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
        Practice2 st = new Practice2();
        st.push(34);
        st.push(55);
        st.push(99);
        st.push(44);
        st.push(88);
        System.out.println("Given Stack: ");
        st.display();
        System.out.println("Stack after partial deletion");
        st.pop();
        st.pop();
        st.display();
        System.out.println("Stack after full deletion");
        st.pop();
        st.pop();
        st.pop();
        st.display();
    }
}

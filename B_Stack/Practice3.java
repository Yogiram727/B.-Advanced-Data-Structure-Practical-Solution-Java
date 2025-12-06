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
        Practice3 st = new Practice3();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println("Given Stack: ");
        st.display();
        System.out.println("Stack after partial deletion: ");
        st.pop();
        st.pop();
        st.display();
        System.out.println("Stack after full deletion: ");
        st.pop();
        st.pop();
        st.pop();
        st.display();
        System.out.println();
    }
}

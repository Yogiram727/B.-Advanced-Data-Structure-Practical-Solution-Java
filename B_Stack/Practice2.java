public class Practice2 {

    int n = 5;
    int[] stack = new int[n];
    int top = -1;

    public void push(int item) {
        if (top == n - 1) {
            System.out.println("Stack Overflow! ");
            return;
        }
        top++;
        stack[top] = item;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Practice2 st = new Practice2();
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(6);
        st.push(8);
        System.out.println("Given Stack: ");
        st.display();
        System.out.println("Stack after partial deletion: ");
        st.pop();
        st.pop();
        st.pop();
        st.display();
        System.out.println("Stack after full deletion: ");
        st.pop();
        st.pop();
        st.display();

    }
}

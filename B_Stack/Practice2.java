package B_Stack;

public class Practice2 {
    int n = 5;
    int[] stack = new int[n];
    int top = -1;

    public void push(int item) {
        if (top == n - 1) {
            System.out.println("Stack overflow");
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
        Practice2 stk = new Practice2();
        stk.push(3);
        stk.push(5);
        stk.push(6);
        stk.push(7);
        stk.push(8);
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

    }
}

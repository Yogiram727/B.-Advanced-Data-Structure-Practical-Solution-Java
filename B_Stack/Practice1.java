package B_Stack;

public class Practice1 {
    int stack[], top, n;

    Practice1() {
        this.top = -1;
        this.n = 5;
        stack = new int[n];
    }

    public void push(int item) {
        if (top == n - 1) {
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top] = item;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is emtpy");
            return;
        }
        top--;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is emtpy");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        Practice1 stk = new Practice1();
        stk.push(11);
        stk.push(22);
        stk.push(33);
        stk.push(44);
        stk.push(55);
        System.out.println("Given Stack: ");
        stk.display();
        System.out.println("Stack after partial deletion: ");
        stk.pop();
        stk.pop();
        stk.display();
        System.out.println("stack after full deletion");
        stk.pop();
        stk.pop();
        stk.pop();
        stk.display();
    }
}

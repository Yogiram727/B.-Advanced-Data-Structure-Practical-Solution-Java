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
            System.out.println("Stack is Full");
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
    }

    public static void main(String[] args) {
        Practice1 stk = new Practice1();
        stk.push(11);
        stk.push(2);
        stk.push(55);
        stk.push(66);
        stk.push(6);
        System.out.println("Given Stack: ");
        stk.display();
        System.out.println("Stack after partial deletion");
        stk.pop();
        stk.pop();
        stk.pop();
        stk.display();
        System.out.println("Stak after full deletion");
        stk.pop();
        stk.pop();
        stk.display();

    }
}

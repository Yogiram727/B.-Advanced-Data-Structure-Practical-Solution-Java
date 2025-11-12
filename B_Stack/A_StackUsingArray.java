
public class A_StackUsingArray {

    private int[] stack = new int[5];
    private int top = -1;

    public void push(int item) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
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
        A_StackUsingArray stack = new A_StackUsingArray();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Elements in stack");
        stack.display();
        System.out.println("Stack after partial deletion");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("Stack after fully deletion");
        stack.pop();
        stack.pop();
        stack.display();
    }
}

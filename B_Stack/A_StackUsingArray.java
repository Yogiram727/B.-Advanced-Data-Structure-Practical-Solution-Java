package B_Stack;

import java.util.Scanner;

public class A_StackUsingArray {
    private int[] stack;
    private int n;
    private int top;

    public A_StackUsingArray(int size) {
        this.n = size;
        this.stack = new int[n];
        this.top = -1;
    }

    public void push(int item) {
        if (top == n - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = item;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Poped Element of the stack: " + stack[top--]);
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
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
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the stack");
        size = sc.nextInt();
        A_StackUsingArray obj = new A_StackUsingArray(size);

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        System.out.println("Stack after insertion: ");
        obj.display();

        System.out.println("Stack after partial deletion: ");
        obj.pop();
        obj.pop();
        obj.display();
        System.out.println("Top element of the stack is: " + obj.peek());

        System.out.println("Stack after fully deletion:");
        obj.pop();
        obj.pop();
        obj.pop();
        obj.display();
        sc.close();

    }
}

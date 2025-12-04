package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice2 {

    public void arithmeticSwitch(int a, int b) {
        Scanner sc = new Scanner(System.in);
        boolean isValid = true;
        int res = 0;
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo Division");
        System.out.println("Enter any option: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                res = a + b;
                break;
            case 2:
                res = a - b;
                break;
            case 3:
                res = a * b;
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Err: Can't Divide by zero");
                    isValid = false;
                } else {
                    res = a / b;
                }
                break;
            case 5:
                res = a % b;
                break;

            default:
                System.out.println("Invalid Input");
                isValid = false;

        }
        if (isValid) {
            System.out.println("Result is: " + res);
        }
    }

    public static void main(String[] args) {
        Practice2 ar = new Practice2();
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();

        ar.arithmeticSwitch(a, b);
        System.out.println();
        sc.close();
    }
}

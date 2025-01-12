package Questions;

import java.util.Scanner;

public class B_switchArithmetic {

    public int arithmeticOperation(int a, int b, Scanner sc) {
        int res = 0;
        System.out.println("Enter your option:");
        System.out.println("-----------------------------------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");

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
                if (b != 0) {
                    res = a / b;
                } else {
                    System.out.println("Can't divide by zero");
                    return -1;
                }
                break;
            case 5:
                res = a % b;
                break;
            default:
                System.out.println("Invalid input");
                return -1;
        }
        return res;

    }

    public static void main(String[] args) {
        B_switchArithmetic obj = new B_switchArithmetic();
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter any two number");
        a = sc.nextInt();
        b = sc.nextInt();
        int result = obj.arithmeticOperation(a, b, sc);
        if (result != -1) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Operation Failed");
        }
        sc.close();

    }
}

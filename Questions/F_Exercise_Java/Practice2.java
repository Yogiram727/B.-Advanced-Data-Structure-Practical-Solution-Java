package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice2 {

    public void arithmeticSwitch() {
        Scanner sc = new Scanner(System.in);
        int a, b, res = 0;
        Boolean valid = true;
        System.out.println("Enter any two number to perform arithmetic operation: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division ");
        System.out.println("5. Modulo Division");
        System.out.println("Enter your choice");
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
                    System.out.println("Can't divide by zero");
                    valid = false;
                } else {
                    res = a / b;
                }
                break;

            case 5:
                res = a % b;
                break;
            default:
                System.out.println("Invalid Input: ");
                valid = false;
                break;
        }
        if (valid) {
            System.out.println("Result= " + res);
        }

        sc.close();
    }

    public static void main(String[] args) {
        Practice2 ar = new Practice2();
        ar.arithmeticSwitch();
    }
}

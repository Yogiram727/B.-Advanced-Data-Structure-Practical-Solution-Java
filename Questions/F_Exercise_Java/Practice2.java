package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice2 {

    public int arithmeticOperate(int a, int b, Scanner sc) {
        int res;
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo Division");

        System.out.println("Enter what operations you want ot perform(1 to 5) ");
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
                    System.out.println("Can't divide by zero ");
                    return -1;
                } else {
                    res = a / b;
                }
                break;
            case 5:
                res = a % b;
                break;
            default:
                System.out.println("Invalid Input!");
                return -1;
        }
        return res;

    }

    public static void main(String[] args) {
        Practice2 p2 = new Practice2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = p2.arithmeticOperate(a, b, sc);
        if (res == -1) {
            System.out.println("Operation Failed");
        } else {
            System.out.println("Result=" + res);
        }
    }

}

package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice3 {

    public void findFactorial() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int f = 1;
        System.out.println("Enter number to find the factorial ");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("Can't find factorial of negative number");

        } else if (num == 0) {
            System.out.println("Factorial of zero is 1");
        } else {
            for (int i = 1; i <= num; i++) {
                f = f * i;
            }
        }
        System.out.println("Factorial of the given number is :" + f);
    }

    public static void main(String[] args) {
        Practice3 fac = new Practice3();
        fac.findFactorial();
    }
}

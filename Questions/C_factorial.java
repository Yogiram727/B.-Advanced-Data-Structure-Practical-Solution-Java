package Questions;

import java.util.Scanner;

public class C_factorial {

    public void findFactorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative number");
        } else if (num == 0) {
            System.out.println("Factorial of 0 is:  1");
        } else {
            int f = 1;
            for (int i = 1; i <= num; i++) {
                f = f * i;
            }
            System.out.println("Factorial of Given Number is :" + f);
        }
    }

    public static void main(String[] args) {
        C_factorial obj = new C_factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to find the factorial ");
        int num = sc.nextInt();
        obj.findFactorial(num);
        sc.close();
    }
}

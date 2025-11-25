package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice3 {

    public void findFactorial(int num) {
        if (num < 0) {
            System.out.println("Can't find factorial of negative number");
        } else if (num == 0) {
            System.out.println("Factorial of 0 is 1");
        } else {
            int f = 1;
            for (int i = 1; i <= num; i++) {
                f = f * i;
            }
            System.out.println("Factorial of Given Number is: " + f);
        }
    }

    public static void main(String[] args) {
        Practice3 fac = new Practice3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to find Factorial: ");
        int num = sc.nextInt();
        fac.findFactorial(num);
        sc.close();
    }
}

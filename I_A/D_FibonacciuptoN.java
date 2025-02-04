package I_A;

import java.util.Scanner;

public class D_FibonacciuptoN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;

        // Custom Input by user how many terms he/she wants
        n = sc.nextInt();

        int a = 0, b = 1;
        // Printing the terms without putting space in between to match the test casees
        // i.e (a) not (a+" ")
        if (n >= 0) {
            System.out.print(a);
        }
        while (b < n) {
            System.out.print(b);
            int c = a + b;
            a = b;
            b = c;
        }
        sc.close();

    }
}

package I_A;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        if (n > 0) {
            System.out.print(a);
        }
        int b = 1;
        while (b <= n) {
            System.out.print(b);
            int c = a + b;
            a = b;
            b = c;

        }
        sc.close();
    }
}
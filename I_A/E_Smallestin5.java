package I_A;

import java.util.Scanner;

public class E_Smallestin5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];

        // Custom Input for 5 number by user e.g. 1 2 3 4 5
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        int min = num[0];
        // Finding the smallest among 5
        for (int i = 0; i < 5; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println(min);
    }
}

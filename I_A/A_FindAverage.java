package I_A;

import java.util.Scanner;

public class A_FindAverage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        double average = 0;
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        average = sum / 5;
        System.out.println(average);
        sc.close();

    }
}

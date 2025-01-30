package I_A;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        double avg = 0, sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        avg = sum / 5;
        System.out.println(avg);
        sc.close();
    }
}

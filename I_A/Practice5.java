package I_A;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];

        for (int i = 0; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        sc.close();
    }
}

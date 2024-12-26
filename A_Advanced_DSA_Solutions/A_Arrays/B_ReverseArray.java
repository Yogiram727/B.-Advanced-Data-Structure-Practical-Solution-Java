package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class B_ReverseArray {
    public void reverseArray(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B_ReverseArray obj = new B_ReverseArray();
        int arr[] = new int[5];
        System.out.println("Enter any five element in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array befor reverse" + Arrays.toString(arr));
        obj.reverseArray(arr);
        System.out.println("Array after reversing: " + Arrays.toString(arr));
        sc.close();
    }
}

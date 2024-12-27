package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Practice {

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
        Practice obj = new Practice();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter any five element in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before reverse: " + Arrays.toString(arr));
        obj.reverseArray(arr);
        System.out.println("Array after reverse: " + Arrays.toString(arr));
        sc.close();
    }
}

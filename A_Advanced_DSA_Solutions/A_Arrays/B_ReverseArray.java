package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class B_ReverseArray {
    public static void reverseArray(int[] arr) {
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
        int[] arr = { 2, 4, 6, 7, 9 };
        System.out.println("Original array: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

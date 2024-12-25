package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice {

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
        int arr[] = { 1, 2, 4, 5, 6, 7 };
        System.out.println("Original Array:  " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed Array:" + Arrays.toString(arr));
    }

}

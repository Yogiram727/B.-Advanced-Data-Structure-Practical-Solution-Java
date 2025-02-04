package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 645, 6 };
        System.out.println("Original Array: " + Arrays.toString(arr));

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Revesed Array: " + Arrays.toString(arr));
    }
}

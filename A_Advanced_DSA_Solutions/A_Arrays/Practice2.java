package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 7 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

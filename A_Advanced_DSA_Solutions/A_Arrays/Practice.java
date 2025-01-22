package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 7, 9 };
        System.out.println("Given Array:" + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum Element in the array is : " + min);
        System.out.println("Maximum Element in the array is : " + max);
    }
}

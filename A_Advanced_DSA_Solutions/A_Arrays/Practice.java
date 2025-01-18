package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 6, 7, 44, 56 };
        int min = arr[0];
        int max = arr[0];
        System.out.println("Given Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array is: " + max);
        System.out.println("Minimum element in the array is : " + min);

    }
}

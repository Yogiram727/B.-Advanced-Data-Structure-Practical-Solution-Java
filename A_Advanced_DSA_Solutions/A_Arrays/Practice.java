package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public void findMinMax(int arr[]) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println();
        System.out.println("Maximum Element in the array is " + max);
        System.out.println();
        System.out.println("Minimum Element in the array is: " + min);
        System.out.println();
    }

    public static void main(String[] args) {
        Practice find = new Practice();
        int arr[] = { 2, 4, 5, 6, 34, 544, 6666, 3, 1 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        find.findMinMax(arr);
    }
}

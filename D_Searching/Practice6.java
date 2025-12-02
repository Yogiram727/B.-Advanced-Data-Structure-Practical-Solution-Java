package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {

    public int linearSearch(int arr[], int value) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int value) {
        int n = arr.length;
        int first = 0, last = n - 1, middle;

        while (first <= last) {
            middle = first + (last - first) / 2;
            if (arr[middle] == value) {
                return middle;
            }
            if (arr[middle] > value) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice6 se = new Practice6();
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 4, 6, 7, 44, 66 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter the value to be searched ");
        int value = sc.nextInt();
        // int result = se.linearSearch(arr, value);
        int result = se.binarySearch(arr, value);
        if (result == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value is at index " + result);
        }
        sc.close();
        System.out.println();
    }
}

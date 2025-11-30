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
        int arr[] = { 1, 36, 7, 5, 34, 734, 454 };
        Arrays.sort(arr);
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter the value to be searched: ");
        int value = sc.nextInt();
        // int res = se.linearSearch(arr, value);

        int res = se.binarySearch(arr, value);
        if (res == -1) {
            System.out.println("Value not found");
        } else {
            System.out.println("Value is at index: " + res);
        }
        System.out.println();
    }
}

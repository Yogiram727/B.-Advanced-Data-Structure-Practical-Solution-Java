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
        int first = 0, last = n - 1, midde;

        while (first <= last) {
            midde = first + (last - first) / 2;
            if (arr[midde] == value) {
                return midde;
            }
            if (arr[midde] > value) {
                last = midde - 1;
            } else {
                first = midde + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Practice6 se = new Practice6();
        Scanner sc = new Scanner(System.in);
        int arr[] = { 3, 4, 6, 7, 8, 99 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter the number that you want to search: ");
        int value = sc.nextInt();
        // int result = se.linearSearch(arr, value);
        int result = se.binarySearch(arr, value);
        if (result == -1) {
            System.out.println("Value not found: ");
            return;
        } else {
            System.out.println("Value is at index: " + result);
        }
        System.out.println();

    }
}

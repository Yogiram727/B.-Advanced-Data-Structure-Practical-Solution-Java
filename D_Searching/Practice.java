package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int x) {
        int n = arr.length;
        int first = 0, last = n - 1, middle;
        while (first <= last) {
            middle = first + (last - first) / 2;
            if (arr[middle] == x) {
                return middle;
            } else if (x < arr[middle]) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice find = new Practice();
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 4, 6, 8, 9 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter the number that you want to search");
        int x = sc.nextInt();
        // int result = find.linearSearch(arr, x);
        int result = find.binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Number is not in the array");

        } else {
            System.out.println("Number is at the index: " + result);
        }
        sc.close();
    }
}

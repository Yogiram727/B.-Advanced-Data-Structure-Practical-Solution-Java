package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public int linearSearch(int arr[], int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int n, int x) {

        int first = 0, last = n - 1, middle;
        while (first <= last) {
            middle = first + (last - first) / 2;

            if (x == arr[middle]) {
                return middle;
            } else if (arr[middle] > x) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice search = new Practice();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int n = 5;
        int x;

        System.out.println("Enter any five element in the array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter the value that you want to search in the array");
        x = sc.nextInt();

        // int result = search.linearSearch(arr, n, x);
        int result = search.binarySearch(arr, n, x);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Given element is at index: " + result);
        }
        sc.close();

    }
}

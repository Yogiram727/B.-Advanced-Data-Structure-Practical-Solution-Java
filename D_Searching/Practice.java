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
        int arr[] = { 34, 46, 67, 88, 99 };
        System.out.println("Given Array" + Arrays.toString(arr));
        System.out.println("Enter the number to search in the array");
        int x = sc.nextInt();
        // int res = find.linearSearch(arr, x);
        int res = find.binarySearch(arr, x);
        if (res == -1) {
            System.out.println("Number is not in the array");
        } else {
            System.out.println("Number is at index:" + res);
        }
        sc.close();
    }
}

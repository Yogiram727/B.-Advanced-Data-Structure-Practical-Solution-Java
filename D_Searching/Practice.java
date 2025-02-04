package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public int linearSearch(int arr[], int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int arr[], int x) {
        int first = 0, last = arr.length - 1, middle;
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
        int arr[] = { 25, 45, 46, 4, 6, 3 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter the number to search");
        int target = sc.nextInt();
        // int res = find.linearSearch(arr, target);
        Arrays.sort(arr);
        int res = find.binarySearch(arr, target);
        if (res == -1) {
            System.out.println("Given Number is not in the array");
        } else {
            System.out.println("Given Number is at index: " + res);
        }
        sc.close();

    }
}

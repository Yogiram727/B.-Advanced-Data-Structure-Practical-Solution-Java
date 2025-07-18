package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {
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
        int first = 0, last = n - 1, mid;
        while (first <= last) {
            mid = first + (last - first) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice6 search = new Practice6();
        Scanner sc = new Scanner(System.in);
        int value, result;
        int arr[] = { 4, 5, 6, 7, 8 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter which value you want to search");
        value = sc.nextInt();
        result = search.linearSearch(arr, value);
        // result=search.binarySearch(arr, value);
        if (result == -1) {
            System.out.println("Given number is not the array: ");

        } else {
            System.out.println("Given number is at index " + result);
        }
        sc.close();
    }
}

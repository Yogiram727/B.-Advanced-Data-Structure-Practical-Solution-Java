package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice6 {

    public int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
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
            } else if (arr[middle] > x) {
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Practice6 ser = new Practice6();
        Scanner sc = new Scanner(System.in);
        int value, result;
        int arr[] = { 1, 6, 7, 9, 19 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Enter which element you want to search in the array");
        value = sc.nextInt();
        // result = ser.linearSearch(arr, value);
        result = ser.binarySearch(arr, value);
        if (result == -1) {
            System.out.println("Value is not in the array");
        } else {
            System.out.println("Value is at index:" + result);
        }
        sc.close();

    }
}

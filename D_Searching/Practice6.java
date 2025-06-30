package D_Searching;

import java.util.Scanner;

public class Practice6 {
    public int linearSearch(int array[], int x) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
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
        Practice6 search = new Practice6();
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        int x;
        System.out.println("Enter any five elements in the array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the element to search in the array");
        x = sc.nextInt();
        // int result = search.linearSearch(arr, x);
        int result = search.binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element is not in the array");

        } else {
            System.out.println("Element is at index:" + result);
        }
        sc.close();

    }
}

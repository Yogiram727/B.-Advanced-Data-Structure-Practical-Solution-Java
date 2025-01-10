package E_Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class Practice {

    public void bubbleSorting(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSorting(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > j) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Practice sort = new Practice();
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int n = 5;
        System.out.println("Enter any 5 unsorted element in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Unsorted Array: " + Arrays.toString(arr));
        // sort.bubbleSorting(arr, n);
        sort.selectionSorting(arr, n);
        System.out.println("Array After Sorting:" + Arrays.toString(arr));
    }
}

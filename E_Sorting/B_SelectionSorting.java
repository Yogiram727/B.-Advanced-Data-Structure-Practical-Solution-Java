package E_Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class B_SelectionSorting {

    public void selectionSorting(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        B_SelectionSorting obj = new B_SelectionSorting();
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements in the array to sort");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Before Sorting: " + Arrays.toString(arr));
        obj.selectionSorting(arr, size);
        System.out.println("Arrays After Sorting: " + Arrays.toString(arr));
        sc.close();
    }
}

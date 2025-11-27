package E_Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice7 {

    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(int arr[]) {
        int n = arr.length;
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
        Practice7 sor = new Practice7();
        int arr[] = { 9, 3, 4, 1, 0, 234, 432 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        // sor.bubbleSort(arr)
        sor.selectionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}

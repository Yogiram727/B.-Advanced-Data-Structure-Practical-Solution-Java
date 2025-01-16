package E_Sorting;

import java.util.Arrays;

public class Practice {
    public void bubbleSorting(int arr[]) {
        int n = arr.length;
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

    public void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
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
        int arr[] = { 9, 5, 3, 21, 1 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        // sort.bubbleSorting(arr);
        sort.selectionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}

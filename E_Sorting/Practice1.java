package E_Sorting;

import java.util.Arrays;

public class Practice1 {

    public void bubbleSort(int arr[]) {
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
        Practice1 sort = new Practice1();
        int arr[] = { 5, 6, 4, 3, 2, 1 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        // sort.bubbleSort(arr);
        sort.selectionSort(arr);
        System.out.println("Arrays after Sorting: " + Arrays.toString(arr));

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Practice7 {

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
        for (int i = 0; i < n; i++) {
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
        Practice7 sort = new Practice7();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter any five unsorted element: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        // sort.bubbleSort(arr);
        sort.selectionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}

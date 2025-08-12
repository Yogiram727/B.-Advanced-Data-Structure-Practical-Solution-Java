
import java.util.Scanner;
import java.util.Arrays;

public class A_BubbleSorting {

    public void bubbleSorting(int[] arr, int n) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A_BubbleSorting obj = new A_BubbleSorting();
        int size;
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Array before sorting" + Arrays.toString(arr));
        obj.bubbleSorting(arr, size);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        sc.close();

    }
}

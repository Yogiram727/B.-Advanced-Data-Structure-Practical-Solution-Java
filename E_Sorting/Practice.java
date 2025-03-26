package E_Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class Practice {
    public void bubbleSorting(int arr[]) {
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

    public static void main(String[] args) {
        Practice obj = new Practice();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter any five number to be sorted");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        obj.bubbleSorting(arr);

        System.out.println("Array after sorting");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}

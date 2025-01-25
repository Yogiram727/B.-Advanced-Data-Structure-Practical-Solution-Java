package D_Searching;

import java.util.Scanner;

public class A_LinearSearch {

    public int linearSearch(int[] arr, int n, int x) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        A_LinearSearch obj = new A_LinearSearch();
        Scanner sc = new Scanner(System.in);
        int x;
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Enter the element to search in the array");
        x = sc.nextInt();
        int result = obj.linearSearch(arr, arr.length, x);
        if (result == -1) {
            System.out.println("Number not found");

        } else {
            System.out.println(+x + " is in the index " + result);
        }

        sc.close();
    }
}

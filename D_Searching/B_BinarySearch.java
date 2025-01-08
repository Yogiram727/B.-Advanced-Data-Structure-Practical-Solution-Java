package D_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class B_BinarySearch {

    public int binarySearch(int[] arr, int n, int x) {
        int first = 0, last = n - 1, middle;

        while (first <= last) {
            middle = first + (last - first) / 2;
            if (arr[middle] == x) {
                return middle;
            } else if (arr[middle] > x) {// search in the left side
                last = middle - 1;
            } else {
                first = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        B_BinarySearch obj = new B_BinarySearch();
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 3, 4, 5, 6 };
        Arrays.sort(arr);
        int x;
        System.out.println("Enter the element to be searched");
        x = sc.nextInt();
        int result = obj.binarySearch(arr, arr.length, x);
        if (result == -1) {
            System.out.println("Number not found");

        } else {
            System.out.println(+x + " is in " + result + " index");
        }
    }
}

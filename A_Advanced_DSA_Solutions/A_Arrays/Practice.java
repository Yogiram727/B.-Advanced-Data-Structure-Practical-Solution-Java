package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice {

    public void findReverse(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Practice rev = new Practice();
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Array before reverse: " + Arrays.toString(arr));
        rev.findReverse(arr);
        System.out.println("Array after reverse" + Arrays.toString(arr));
    }
}

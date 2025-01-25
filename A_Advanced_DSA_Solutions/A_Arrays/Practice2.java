package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice2 {
    public void findMinimumDifference(int arr[], int m) {
        int n = arr.length;
        if (m > n) {
            System.out.println(" Number of packets are less than that of students");
            return;
        }
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        int startIndex = -1;

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
                startIndex = i;
            }
        }

        System.out.println("Minimum Differnce is : " + minDiff);

        System.out.print("Chocolates packets to be distributed ");
        for (int i = startIndex; i < m + startIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Practice2 obj = new Practice2();
        int[] chocolates = { 7, 3, 2, 4, 9, 12, 56 };
        System.out.println("Given Array: " + Arrays.toString(chocolates));
        obj.findMinimumDifference(chocolates, 3);
    }
}

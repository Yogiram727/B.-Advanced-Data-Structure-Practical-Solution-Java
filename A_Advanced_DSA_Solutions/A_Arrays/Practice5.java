package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice5 {
    public int findMinDifference(int arr[], int m) {
        int n = arr.length;
        if (m > n) {
            System.out.println("Number of packets are less than number of students");
            return -1;
        }
        int minDiff = Integer.MAX_VALUE;
        int startIndex = -1;

        Arrays.sort(arr);

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
                startIndex = i;
            }
        }
        System.out.print("Packet to be distributed:  ");
        for (int i = startIndex; i < startIndex + m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return minDiff;

    }

    public static void main(String[] args) {
        Practice5 obj = new Practice5();
        int[] chocolates = { 7, 3, 2, 4, 9, 12, 56 };
        System.out.println("Given Packets : " + Arrays.toString(chocolates));
        int res = obj.findMinDifference(chocolates, 3);
        System.out.println("Minimum Difference is : " + res);
    }
}

package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice2 {
    public void findMinimumDiff(int arr[], int m) {
        int n = arr.length;
        if (m > n) {
            System.out.println("Number of stuents exceeds number of packets");
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

        System.out.print("Minimum Difference is :" + minDiff);
        System.out.println();

        System.out.print("Chocolotes Packets to be distributed: ");
        for (int i = startIndex; i < m + startIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Practice2 obj = new Practice2();
        int[] chocolates = { 7, 3, 2, 4, 9, 12, 56 };
        System.out.println("Given arrays of Chocholates packets: " + Arrays.toString(chocolates));
        obj.findMinimumDiff(chocolates, 3);

    }
}

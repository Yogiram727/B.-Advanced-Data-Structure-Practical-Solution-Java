package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice3 {
    public void findMinDifference(int arr[], int m) {
        int n = arr.length;
        if (m > n) {
            System.out.println("Insuffient packets for give students");
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
        System.out.println("MinDifference: " + minDiff);
        System.out.print("Chaocolates Packets to be distributed: ");
        for (int i = startIndex; i < startIndex + m; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Practice3 obj = new Practice3();
        int[] chocolates = { 7, 3, 2, 4, 9, 12, 56 };
        obj.findMinDifference(chocolates, 3);

    }
}

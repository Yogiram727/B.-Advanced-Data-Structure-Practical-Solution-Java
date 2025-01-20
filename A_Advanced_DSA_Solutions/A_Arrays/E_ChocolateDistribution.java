package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class E_ChocolateDistribution {
    public int findMinDifference(int arr[], int m) {
        int n = arr.length;
        if (m > n) {
            System.out.println("Not enough packets for all the students");
            return -1;
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

        System.out.print("Packet distributed to students: ");
        for (int i = startIndex; i < startIndex + m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return minDiff;
    }

    public static void main(String[] args) {
        E_ChocolateDistribution obj = new E_ChocolateDistribution();
        int[] chocolates = { 7, 3, 2, 4, 9, 12, 56 };
        int m = 3;

        int result = obj.findMinDifference(chocolates, m);
        if (result != -1) {
            System.out.println("The minimum difference is: " + result);
        }
    }
}

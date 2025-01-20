package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice2 {
    public int chocolateDistribution(int arr[], int m) {
        int n = arr.length;
        if (m > n) {
            System.out.println("Number of students are more than packets");
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
        System.out.print("Packet Distributed to: ");
        for (int i = startIndex; i < startIndex + m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return minDiff;
    }

    public static void main(String[] args) {
        Practice2 obj = new Practice2();
        int[] chocolates = { 7, 3, 2, 4, 9, 12, 56 };
        int res = obj.chocolateDistribution(chocolates, 3);
        if (res != -1) {
            System.out.println("Minimum difference is : " + res);
        }
    }
}

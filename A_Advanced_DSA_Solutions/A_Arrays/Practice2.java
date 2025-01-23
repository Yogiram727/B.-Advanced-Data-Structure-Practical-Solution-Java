package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;

public class Practice2 {

    public int findMinDiff(int arr[], int m) {
        int n = arr.length;
        if (m > n) {
            System.out.println("Number of packets are less than that of students ");
            return -1;
        }

        int minDiff = Integer.MAX_VALUE;

        int startIndex = -1;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
                startIndex = i;
            }
        }

        System.out.print("Chocolates to be distributed: ");
        for (int i = startIndex; i < startIndex + m; i++) {
            System.out.print(arr[i] + " ");
        }
        return minDiff;

    }

    public static void main(String[] args) {
        Practice2 obj = new Practice2();
        int[] chocolates = { 7, 3, 2, 4, 9, 12, 56 };
        Arrays.sort(chocolates);
        System.out.println("Given Array: " + Arrays.toString(chocolates));

        int res = obj.findMinDiff(chocolates, 3);

        System.out.println("Minimum Difference is : " + res);
    }

}

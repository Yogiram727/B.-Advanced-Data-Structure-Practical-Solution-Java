package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.HashSet;
import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        HashSet<Integer> seen = new HashSet<>();
        int arr[] = { 1, 34, 5, 56, 7, 7 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        boolean isDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                isDuplicate = true;
                break;
            }
            seen.add(arr[i]);
        }
        if (isDuplicate) {
            System.out.println("Array Contains Duplicate Value");
        } else {
            System.out.println("Array doesn't contains duplicate value");
        }
    }
}

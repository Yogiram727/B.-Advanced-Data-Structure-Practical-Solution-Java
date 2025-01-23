package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.HashSet;
import java.util.Arrays;

public class Practice1 {
    public boolean isDuplicate(int arr[]) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        int arr[] = { 1, 35, 46, 6, 6 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        if (obj.isDuplicate(arr)) {
            System.out.println("Array Contains duplicate elements");
        } else {
            System.out.println("Array Doesn't contains duplicate elements ");
        }
    }

}

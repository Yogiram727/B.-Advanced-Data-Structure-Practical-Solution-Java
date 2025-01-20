package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.HashSet;
import java.util.Arrays;

public class Practice {
    public boolean checkDuplicate(int nums[]) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        int arr[] = { 1, 4, 6, 8, 7 };
        System.out.println("Given Array:" + Arrays.toString(arr));
        if (obj.checkDuplicate(arr)) {
            System.out.println("Arrays contains duplicate elements");
        } else {
            System.out.println("Array doesn't contain duplicate element");
        }

    }
}

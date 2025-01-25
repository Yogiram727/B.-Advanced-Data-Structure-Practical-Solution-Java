package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Practice1 {
    public boolean containsDuplicate(int arr[]) {
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
        int arr[] = { 1, 34, 66, 7, 45, 1 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        if (obj.containsDuplicate(arr)) {
            System.out.println("Array contains duplicate elements");
        } else {
            System.out.println("Array doesn't contain duplicate elements");
        }
    }
}

package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.HashSet;
import java.util.Arrays;

public class Practice1 {

    public boolean findDuplicate(int arr[]) {
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
        int arr[] = { 2, 45, 6, 69, 7 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        if (obj.findDuplicate(arr)) {
            System.out.println("Array contains duplicate elements ");
        } else {
            System.out.println("Array doesn't contain duplicate elements");
        }
    }
}

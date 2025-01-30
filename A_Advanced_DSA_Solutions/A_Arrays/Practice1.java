package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.HashSet;

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
        int arr[] = { 1, 3, 4, 88, 45, 7, 88 };
        if (obj.isDuplicate(arr)) {
            System.out.println("Array Contains Duplicate Elements");
        } else {
            System.out.println("Array doesn't contain duplicate elements");
        }

    }
}

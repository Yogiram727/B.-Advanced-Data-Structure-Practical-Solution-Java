package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.HashSet;

public class Practice5 {
    public boolean checkDuplicate(int arr[]) {
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
        Practice5 obj = new Practice5();

        int arr[] = { 1, 2, 4, 5, 5 };
        System.out.println(obj.checkDuplicate(arr));
    }
}

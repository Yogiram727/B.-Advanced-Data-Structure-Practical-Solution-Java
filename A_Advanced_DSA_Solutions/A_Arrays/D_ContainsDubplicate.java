package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.HashSet;

public class D_ContainsDubplicate {
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
        D_ContainsDubplicate check = new D_ContainsDubplicate();
        int a[] = { 1, 2, 4, 5 };
        System.out.println(check.checkDuplicate(a));

        int b[] = { 1, 2, 4, 1 };
        System.out.println(check.checkDuplicate(b));
    }
}

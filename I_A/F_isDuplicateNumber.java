package I_A;

import java.util.Arrays;

public class F_isDuplicateNumber {
    public static void main(String args[]) {
        int arr[] = { 3, 534, 64, 6, 68 };
        System.out.println("Given Array: " + Arrays.toString(arr));
        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = Integer.MIN_VALUE;
                }
            }
            if (count > 1 && arr[i] != Integer.MIN_VALUE) {
                System.out.println(arr[i]);
                hasDuplicate = true;
            }
        }
        if (!hasDuplicate) {
            System.out.println("No duplicate element in the array");
        }

    }
}

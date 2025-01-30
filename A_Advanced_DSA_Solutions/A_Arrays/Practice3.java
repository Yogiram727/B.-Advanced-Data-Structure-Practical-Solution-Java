package A_Advanced_DSA_Solutions.A_Arrays;

public class Practice3 {
    public int searchRotatedSort(int arr[], int target) {
        int n = arr.length;
        int left = 0, right = n - 1, middle;

        while (left <= right) {
            middle = left + (right - left) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            if (arr[left] < arr[middle]) {
                if (target >= arr[left] && target < arr[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target > arr[middle] && target <= arr[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Practice3 obj = new Practice3();
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int res = obj.searchRotatedSort(nums, 96);
        if (res == -1) {
            System.out.println("Number is not in the array");
        } else {
            System.out.println("Numbe is at index: " + res);
        }
    }
}

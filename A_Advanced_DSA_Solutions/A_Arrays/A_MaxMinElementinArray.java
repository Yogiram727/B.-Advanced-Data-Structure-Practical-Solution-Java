package A_Advanced_DSA_Solutions.A_Arrays;

public class A_MaxMinElementinArray {
    public static void main(String args[]) {
        int[] array = { 3, 4, 5, 8, 1 };

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Minimum element in array is: " + min);
        System.out.println("Maximum element in array is: " + max);
    }
}

package A_Advanced_DSA_Solutions.A_Arrays;

import java.util.Scanner;

public class A_MaxMinElementinArray {
    public void findMinMax(int array[]) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum element in array is : " + max);
        System.out.println("Minimum element in array is: " + min);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            A_MaxMinElementinArray obj = new A_MaxMinElementinArray();
            int[] array = new int[5];
            System.out.println("Enter elements in the array");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            obj.findMinMax(array);
            sc.close();
        } catch (Exception e) {
            System.out.println("An error occured while reading the input ");
        }
    }
}

package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice1 {

    public void findSumOfDigit(int num) {
        int sum = 0, rem = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sums of the given digit is : " + sum);
    }

    public static void main(String[] args) {
        Practice1 su = new Practice1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the sum of its digit: ");
        int num = sc.nextInt();
        su.findSumOfDigit(num);
        sc.close();
    }
}

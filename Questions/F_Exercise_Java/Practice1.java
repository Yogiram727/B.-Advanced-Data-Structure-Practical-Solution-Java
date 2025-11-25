package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice1 {

    public int sumOfDigit(int num) {
        int sum = 0, rem = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Practice1 su = new Practice1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit to find its sum");
        int num = sc.nextInt();
        int sum = su.sumOfDigit(num);
        System.out.println("Sum of Given Digit is : " + sum);
        sc.close();
    }
}

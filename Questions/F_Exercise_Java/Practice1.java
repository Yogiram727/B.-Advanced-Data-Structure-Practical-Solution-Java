package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice1 {

    public void sumofDigit(int num) {
        int sum = 0, rem = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of the digits: " + sum);
        System.out.println();
    }

    public static void main(String[] args) {
        Practice1 sum = new Practice1();
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter any number: ");
        num = sc.nextInt();
        sum.sumofDigit(num);

    }

}

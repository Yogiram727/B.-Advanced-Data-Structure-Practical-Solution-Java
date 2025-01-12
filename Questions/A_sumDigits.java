package Questions;

import java.util.Scanner;

public class A_sumDigits {

    public int findSumofDigits(int num) {
        int rem, sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        A_sumDigits obj = new A_sumDigits();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to find the sum of its digit");
        int num = sc.nextInt();
        int sum = obj.findSumofDigits(num);
        System.out.println("Sum of digit is :" + sum);
        sc.close();
    }
}

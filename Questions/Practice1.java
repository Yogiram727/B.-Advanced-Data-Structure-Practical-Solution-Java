package Questions;

import java.util.Scanner;

public class Practice1 {

    public int findSumOfDigit(int num) {
        int rem = 0, sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = rem + sum;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Practice1 obj = new Practice1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int sum = obj.findSumOfDigit(num);
        System.out.println("Sum of given number is : " + sum);
        sc.close();
    }
}

package Questions.F_Exercise_Java;

import java.util.Scanner;

public class Practice7 {

    public boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Practice7 pcheck = new Practice7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        if (pcheck.checkPrime(num)) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
        sc.close();
    }
}

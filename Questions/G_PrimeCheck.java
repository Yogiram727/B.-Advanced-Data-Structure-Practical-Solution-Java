package Questions;

import java.util.Scanner;

public class G_PrimeCheck {
    public boolean checkPrime(int num) {
        if (num < 1) {

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
        G_PrimeCheck obj = new G_PrimeCheck();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        if (obj.checkPrime(num)) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
        sc.close();
    }
}

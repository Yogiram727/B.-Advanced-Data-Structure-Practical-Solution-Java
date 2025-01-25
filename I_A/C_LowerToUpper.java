package I_A;

import java.util.Scanner;

public class C_LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter small letter "hello" inside the custom input section and press compile
        // and run
        String str = sc.nextLine();

        System.out.println(str.toUpperCase());

        sc.close();
    }
}

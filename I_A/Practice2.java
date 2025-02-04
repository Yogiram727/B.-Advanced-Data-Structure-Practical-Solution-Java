package I_A;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();

        char str[] = str1.toCharArray();

        for (int i = 0; i < str.length; i++) {
            int count = 1;
            if (str[i] != ' ' && str[i] != '0') {
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i] == str[j]) {
                        count++;
                        str[j] = '0';
                    }
                }
            }
            if (count > 1) {
                System.out.println(str[i]);
            }

        }
        sc.close();
    }
}

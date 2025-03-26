package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Etner any string");
        String str1 = sc.nextLine();
        char str[] = str1.toCharArray();
        System.out.println(Arrays.toString(str));
        String str2 = new String(str);
        System.out.println(str2);

    }
}

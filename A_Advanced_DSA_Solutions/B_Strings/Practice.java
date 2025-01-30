package A_Advanced_DSA_Solutions.B_Strings;

import java.util.Scanner;

public class Practice {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String to Check: ");
        String s = sc.nextLine();
        if (obj.isPalindrome(s)) {
            System.out.println(s + " is Palindrome");
        } else {
            System.out.println(s + " is not Palindrome");
        }

    }
}

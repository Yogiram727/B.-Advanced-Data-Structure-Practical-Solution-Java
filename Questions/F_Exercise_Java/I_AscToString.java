package Questions.F_Exercise_Java;

public class I_AscToString {
    public static void main(String[] args) {
        byte asc[] = { 66, 67, 68, 69, 70 };
        String str1 = new String(asc);
        System.out.println(str1);
        String str2 = new String(asc, 2, 3);
        System.out.println(str2);

    }
}

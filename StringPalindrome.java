import java.util.*;

public class StringPalindrome {

    public static boolean checkpalindrome(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            int n = name.charAt(name.length()) / 2;
            if (name.charAt(i) != name.charAt(n - 1 - i)) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        String name = "noon";
        System.out.print(checkpalindrome(name));

    }

}

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string");
        String s;
        s = sc.next();
        String S = "";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '_') {
                S = S + '^';
                c++;
            }
            if (i == s.length() - 1 && s.charAt(i) == '_') {
                S = S + s.charAt(i) + '^';
                c++;
                continue;
            }
            if (s.charAt(i) == '^' && (i == s.length() - 1 || s.charAt(i + 1) == '^' || s.charAt(i + 1) == '_')) {
                S = S + s.charAt(i);
                continue;
            }
            if (s.charAt(i) == '_' && s.charAt(i + 1) == '^') {
                S = S + s.charAt(i);
                continue;
            }
            if (s.charAt(i) == '_' && s.charAt(i + 1) == '_') {
                c++;
                S = S + s.charAt(i) + '^';
            }
        }
        // System.out.println(S);
        System.out.println(c);
    }
}
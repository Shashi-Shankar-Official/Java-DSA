import java.util.*;
// Online IDE - Code Editor, Compiler, Interpreter

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        sb.reverse();
        System.out.println(sb);
    }
}

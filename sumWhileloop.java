import java.util.*;

public class sumWhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nat = sc.nextInt();
        int a = 1;
        int sum = 0;
        while (a <= nat) {
            // sum = sum + a;
            sum += a;
            a++;
            // System.out.println(sum); this will give the value of sum after each loop
        }
        System.out.println(sum);
    }

}
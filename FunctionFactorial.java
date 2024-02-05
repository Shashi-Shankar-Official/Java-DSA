import java.util.*;

public class FunctionFactorial {
    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {

            f = f * i;

        }

        return f; // factorial of n

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }

}

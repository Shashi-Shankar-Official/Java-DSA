import java.util.*;

public class FunctionBinomialcoefficient {
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
        int r = sc.nextInt();
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nrfact = factorial(n - r);
        System.out.println((nfact) / (rfact * nrfact));

    }

}

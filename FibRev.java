import java.util.*;

class FibRev {

    public static int calFib(int n, int f[]) { // TC=O(n)
        if (n == 1 || n == 0) {
            return n;
        }

        if (f[n] != 0) {
            return f[n];
        }

        f[n] = calFib(n - 1, f) + calFib(n - 2, f);
        return f[n];
    }

    public static int tabFib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        int fib[] = new int[n + 1];
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        int n = 6;
        int f[] = new int[n + 1];
        System.out.println(calFib(n, f));
        System.out.println(tabFib(n));
    }
}
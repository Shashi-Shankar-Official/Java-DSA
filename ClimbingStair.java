import java.util.*;

public class ClimbingStair {

    public static int climbRec(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return climbRec(n - 1) + climbRec(n - 2);
    }

    public static int memoClimb(int n, int f[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (f[n] != 0) {
            return f[n];
        }
        f[n] = memoClimb(n - 1, f) + memoClimb(n - 2, f);
        return f[n];
    }

    public static int tabulationCycle(int n) {
        int tab[] = new int[n + 1];
        tab[1] = 1;
        tab[0] = 1;
        for (int i = 2; i <= n; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }

        return tab[n];
    }

    public static void main(String[] args) {
        // System.out.println(climbRec(4));
        int n = 5;
        int f[] = new int[n + 1];
        System.out.println(memoClimb(n, f));
        System.out.println(tabulationCycle(n));
    }

}

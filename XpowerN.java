public class XpowerN {

    public static int pow(int x, int n) {
        if (n == 1) {
            return x;
        }

        // int xnm1 = pow(x, n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * pow(x, n - 1);
    }

    public static int optimisedPow(int a, int n) {

        if (n == 1) {
            return a;
        }

        // if(n == 0) { this can also be used as base case
        // return 1;
        // }
        int halfpower = optimisedPow(a, n / 2);
        int halfpowsquare = halfpower * halfpower;

        // n is odd
        if (n % 2 != 0) {
            halfpowsquare = a * halfpowsquare;
        }

        return halfpowsquare;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        int a = 2;
        // System.out.println(pow(x, n));
        System.out.println(optimisedPow(a, n));
    }

}

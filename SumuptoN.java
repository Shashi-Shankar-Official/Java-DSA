public class SumuptoN {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = sum(n - 1);
        int fn = n + sum(n - 1);

        return fn;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }

}

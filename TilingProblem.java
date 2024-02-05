public class TilingProblem {

    public static int tilingProb(int n) {

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice
        int fnm1 = tilingProb(n - 1);

        // horizontal choice
        int fnm2 = tilingProb(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(tilingProb(n));
    }

}

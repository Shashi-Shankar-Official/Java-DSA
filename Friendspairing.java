public class Friendspairing {

    public static int friendspair(int n) {

        if (n == 1 || n == 2) {
            return n;
        }
        // choice
        // single
        int fnm1 = friendspair(n - 1);

        // pair
        int fnm2 = friendspair(n - 2);
        int pairways = (n - 1) * fnm2;

        // total ways
        int totalways = fnm1 + pairways;

        return totalways;

    }

    public static void main(String[] args) {
        System.out.println(friendspair(3));
    }

}

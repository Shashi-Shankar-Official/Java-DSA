public class butterflyPattern {
    public static void buttterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {

            // for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }

            // for spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    public static void butter(int n) {

        for (int i = 1; i <= n; i++) {

            // for stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + " ");
            }

            // for spaces
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" " + " ");
            }

            // for stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        buttterflyPattern(4);
        butter(4);
    }

}

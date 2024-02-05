public class PrintNumIncreasing {

    public static void printnum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printnum(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printnum(n);

    }

}

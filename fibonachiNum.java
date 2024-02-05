public class fibonachiNum {

    public static int fibnum(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        // fibnum(n - 1);
        int fibnm1 = fibnum(n - 1);
        int fibnm2 = fibnum(n - 2);
        int fibn = fibnm1 + fibnm2;

        return fibn;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.print(fibnum(n));

    }

}

public class oddOrEven {

    public static void oddoreven(int n) {
        int bitmass = 1;
        int num = n & bitmass;

        if (num == 1) {
            System.out.println("the given number is odd");
        } else {
            System.out.println("the given number is even");
        }
    }

    public static void main(String[] args) {
        int n = 8;
        oddoreven(n);
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(~5);
        // System.out.println(5 ^ 6);

    }

}

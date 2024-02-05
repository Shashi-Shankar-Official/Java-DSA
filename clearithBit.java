public class clearithBit {
    public static int clearithbit(int n, int i) {
        int bitmass = ~(1 << i);
        int num = n & bitmass;
        return num;
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        System.out.println(clearithbit(n, i));

    }

}

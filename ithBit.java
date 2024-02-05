public class ithBit {
    public static void getithbit(int n, int i) {

        int bitmass = 1 << i;
        int num = n & bitmass;
        if (num == 0) {
            System.out.println("the" + i + " th position is 0");

        } else {
            System.out.println("the " + i + "th position is 1");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        getithbit(n, i);

    }

}

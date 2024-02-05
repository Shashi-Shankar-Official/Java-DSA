public class SetithBit {

    public static int setithbit(int n, int i) {
        int bitmass = 1 << i;
        int num = n | bitmass;
        return num;

    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(setithbit(n, i));

    }

}

public class updateithBit {

    public static int clearithbit(int n, int i) {
        int bitmass = ~(1 << i);
        int num = n & bitmass;
        return num;
    }

    public static int setithbit(int n, int i) {
        int bitmass = 1 << i;
        int num = n | bitmass;
        return num;
    }

    public static int updateithbit(int n, int i, int newbit) {
        if (newbit == 0) {
            return clearithbit(n, i);

        } else {
            return setithbit(n, i);

        }

    }

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int newbit = 1;
        System.out.println(updateithbit(n, i, newbit));

    }

}

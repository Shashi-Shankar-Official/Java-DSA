public class clearLastiBits {
    public static int cleariBits(int n, int i) {
        int bitmask = (~0) << i; // bitmass = bitmask
        return n & bitmask;

    }

    public static void main(String[] args) {
        System.out.print(cleariBits(15, 2));
        
    }

}

public class checkpowerOfTwo {

    public static boolean ispoweroftwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(ispoweroftwo(n));

    }

}

public class typepromotion {
    public static void main(String[] args) {
        /*
         * char a = 'a';
         * char b = 'b';
         * System.out.println((int) b);
         * System.out.println((int) (a));
         * System.out.println(b - a);
         * // typepromotions only happens when the operations are present
         */
        /*
         * short a = 5;
         * byte b = 25;
         * char c = 'c';
         * byte bt = (byte) a + b + c;
         */
        // this will give error

        // wrong
        // byte b = 5;
        // b = b * 2;//

        // right
        byte b = 5;
        b = (byte) (b * 3);
        System.out.println(b);

    }

}

import java.util.*;

public class BinaryString {

    public static void stringprob(int n, int lastPlace, String str) {
        // base case
        if (n == 0) {
            System.out.println(str);

            return;
        }
        // kaam
        if (lastPlace == 0) {
            // sit 0 on chair n

            stringprob(n - 1, 0, str + "0");
            // sit 1 on char n

            stringprob(n - 1, 1, str + "1");

        } else {

            stringprob(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        StringBuilder str = new StringBuilder("");
        stringprob(n, 0, "");

    }

}

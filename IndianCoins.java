import java.util.*;

public class IndianCoins {

    public static void main(String[] args) {
        int curr[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int target = 121;

        int count = 0;
        Arrays.sort(curr);
        int j = curr.length - 1;
        for (int i = target; i > 0;) {
            int div = i / curr[j];
            // System.out.println(div);
            count += div;
            i = i - div * curr[j];
            j--;
        }
        System.out.println(count);
    }

}

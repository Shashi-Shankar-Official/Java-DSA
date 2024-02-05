import java.util.*;

public class reverseofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            int remainder = num % 10;
            System.out.print(remainder);
            num = num / 10;

        }

    }

}

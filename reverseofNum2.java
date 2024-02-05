import java.util.*;

public class reverseofNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int remainder = 0;
        ;
        while (num > 0) {
            int lastdigit = num % 10;

            num = num / 10;
            remainder = (remainder * 10) + lastdigit;

        }
        System.out.print(remainder);
    }

}

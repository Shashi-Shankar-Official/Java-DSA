import java.util.*;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto whcich you want to see ");
        int num = sc.nextInt();
        int digit = 1;
        while (digit <= num) {
            System.out.println("hello World " + digit);

            // digit = digit++; this is wrong
            digit++;
            System.out.println(digit);
        }

    }

}

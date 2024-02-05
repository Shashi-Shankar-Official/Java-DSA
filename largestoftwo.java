import java.util.*;

public class largestoftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Ente the second number");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("The largest number is " + num1);
        } else {
            System.out.println("The largest number is " + num2);
        }

    }

}

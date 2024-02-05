import java.util.*;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = sc.nextInt();
        switch (age) {
            case 2:
                System.out.println("Your age is 2");
                break;
            case 6:
                System.out.println("Your age is 6");
                break;
            case 17:
                System.out.println("Your age is 17");
                break;
            case 44:
                System.out.println("Your age is 44");
                break;
            default:
                System.out.println("hello");
                break;
            // in case of the SWITCH CASE statement if one case is true then all the case
            // after that will automatically gets true.

            // we can also put character also.

        }

    }

}

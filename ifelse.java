import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write Your age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You can vote now");

        }
        if (age >= 16 && age < 18) {
            System.out.println("You are a teenager now");
        } else {
            System.out.println("You cannot vote now");
        }
    }

}

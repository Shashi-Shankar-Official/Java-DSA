import java.util.*;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenage");
        } else {
            System.out.println("Child");
        }

    }

}

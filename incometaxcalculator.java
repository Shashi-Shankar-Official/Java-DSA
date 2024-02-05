import java.util.*;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();

        if (income < 500000) {
            System.out.println("You have 0% tax " + (int) (income * 0));
        } else if (income >= 500000 && income < 1000000) {
            System.out.println("You have 20% tax " + (int) (income * 0.2));
        } else {
            System.out.println("You have 30% tax" + (int) (income * 0.3));
        }
    }

}

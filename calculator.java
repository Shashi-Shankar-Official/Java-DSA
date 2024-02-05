import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter which one You want\n 1.) addition \n 2.) subtraction \n 3.) multiplication \n 4.) division \n 5.) finding remainder");

        int num = sc.nextInt();
        System.out.println("Enter the first number\n");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number \n");
        Double num2 = sc.nextDouble();
        switch (num) {
            case 1:
                System.out.println("The sum of a and b is " + (num1 + num2));
                break;
            case 2:
                System.out.println("The subtraction of a and b is " + (num1 - num2));
                break;
            case 3:
                System.out.println("the multiplication of a and b is " + num1 * num2);
                break;
            case 4:
                System.out.println("the division of a and b is " + (num1 / num2));
                break;
            case 5:
                System.out.println("the remainder of a/b is  " + (num1 % num2));
                break;
            default:
                System.out.println("You have entered the wrong input, thanks ");
                break;
        }
    }

}

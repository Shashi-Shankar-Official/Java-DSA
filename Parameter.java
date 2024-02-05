import java.util.*;

public class Parameter {
    public static void calculatesum(char num, int num1, int num2) { // parameters or formal paramerter
        // input inside the function is known as parameter

        int sum = num1 + num2 + num;
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = 's';
        calculatesum(c, a, b); // arguments or actual parameters

    }

}

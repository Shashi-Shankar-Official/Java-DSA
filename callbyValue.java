import java.util.*;

public class callbyValue {
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static void calculatesum(int num1, int num2) { // parameters or formal paramerter
        // input inside the function is known as parameter

        int sum = num1 + num2;
        System.out.println(sum);

    }

    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        return;
    }

    public static void main(String[] args) {
        // swap = value change
        int a = 5;
        int b = 10;
        System.out.println(a);
        System.out.println(b);
        swap(a, b);
        calculatesum(a, b);

    }

}

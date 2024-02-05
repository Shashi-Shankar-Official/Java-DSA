import java.util.*;

public class largestNumberArray {
    public static int getlargestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE; // minus infinity

        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {
                largest = numbers[i];
            }

            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }

        System.out.println("Smallest vlaue is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("largest number is: " + getlargestNumber(numbers));

    }

}

import java.util.*;

public class largestString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        // String fruits[] = { "s", "mango", "banana" };

        String numbers[] = new String[2];
        numbers[1] = str1;
        numbers[2] = str2;
        String largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (largest.compareToIgnoreCase(numbers[i]) < 0) {
                largest = numbers[i];

            }
        }
        System.out.println(largest);

    }

}

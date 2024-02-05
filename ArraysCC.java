import java.util.*;

public class ArraysCC {

    public static void main(String[] args) {
        int marks[] = new int[100];
        int numbers[] = { 1, 2, 3 };
        int moreNumbers[] = { 4, 5, 6 };
        String fruits[] = { "apple", "banana" };

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy: " + marks[0]);
        System.out.println("che: " + marks[1]);
        System.out.println("maths: " + marks[2]);

        /*
         * update of marks
         * marks[2] = 100;
         * System.out.println("maths: " + marks[2]);
         */

        /*
         * updation of marks(we can use +,-,*,division also)
         * marks[2] = marks[2] + 1;
         * System.out.println("maths: " + marks[2]);
         */

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println(percentage);

        System.out.println("length of array is: " + marks.length);
    }
}

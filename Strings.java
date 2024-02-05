import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

    }

    public static void main(String[] args) {
        /*
         * char arr[] = { 'a', 'b', 'c', 'd' };
         * String str = "abcd";
         * String str2 = new String("xyz@1234");
         * 
         * Scanner sc = new Scanner(System.in);
         * // String im = sc.nextLine(); // can print paragraph also
         * 
         * String im;
         * // im = sc.next(); // for single word only
         * im = sc.nextLine();
         * 
         * System.out.print(im);
         */
        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        String firstName = "Shashi";
        String lastName = "Shankar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName + "is this");
        // System.out.println(fullName.charAt(0));

        printLetters(fullName);

    }

}

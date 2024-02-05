import java.util.*;

public class doWhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        do {
            System.out.println("Hello World");
            i++;
        } while (i <= num);
        // } while ( true ); this is used for running the loop till infinite
    }

}

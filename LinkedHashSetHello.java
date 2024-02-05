import java.util.*;

public class LinkedHashSetHello {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("hello");
        lhs.add("bye");
        lhs.add("gaya");
        lhs.add("went");

        System.out.println(lhs); // it stores values in order we enter them

        lhs.remove("gaya");
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        lhs.clear();
        System.out.println(lhs.isEmpty());
        System.out.println(lhs);
        System.out.println("Shashi Shankar");

    }

}


import java.util.*;

public class LinkedHashMaphello {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("us", 50);
        lhm.put("China", 150);

        System.out.println(lhm); // it stores the keys in the same order we inserted them into it
        // it implements on the basis of doubly linkedlist
    }
}

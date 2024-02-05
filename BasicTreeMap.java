import java.util.TreeMap;

public class BasicTreeMap {

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);

        tm.put("US", 50);
        tm.put("China", 150);
        tm.put("Indonesia", 20);
        tm.put("Nepal", 5);
        System.out.println(tm); // alphabatical order
        // black red tree

    }

}

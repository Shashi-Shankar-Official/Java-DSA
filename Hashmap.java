import java.util.*;
// import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("India", 140);

        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.get("Bhutan")); // this will return null
        System.out.println(hm.containsKey("India")); // this will return true
        System.out.println(hm.containsKey("Japan")); // this will return false

        // remove
        // hm.remove("China"); // this will remove china and its value and will return
        // its value
        System.out.println(hm.remove("China"));
        System.out.println(hm.get("China"));

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm.isEmpty());

    }

}

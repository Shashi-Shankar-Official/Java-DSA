import java.util.*;

public class TreeSetHello {

    public static void main(String[] args) {
        // TreeSet is sorted in ascending order
        // NULL values are NOT allowed
        // implements using tree map
        // time complexity is generally of the order log(n)
        TreeSet<String> tm = new TreeSet<>();
        tm.add("shahi");
        tm.add("pathak");
        tm.add("aryan");
        tm.add("mrigank");

        System.out.println(tm); // [aryan, mrigank, pathak, shahi] this will be output
        // all the functions which are in the hashmap are same in hashset
    }

}
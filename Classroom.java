import java.util.ArrayList;

public class Classroom {
    public static void main(String args[]) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> shashi = new ArrayList<>();
        // Add an element to arraylist --O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        shashi.add(6);
        // list.add(7);

        // list.add(1, 9); // by this code we can directly put a value at a particular
        // -- O(n)
        // index (at idx 1 in this case)

        System.out.println(list);

        // get the value of an index of arraylist -- O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // Delete an element
        // list.remove(2);
        // System.out.println(list);

        // set the value of a predefined index
        // list.set(2, 10); // (index, new value);
        // System.out.println(list);

        // contains an element
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(24));

        System.out.println(list.size());
        // print the arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
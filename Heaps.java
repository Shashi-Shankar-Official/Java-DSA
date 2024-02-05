import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

public class Heaps {

    static class Student implements Comparable<Student> { // function overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        /*
         * // PriorityQueue<Integer> pq = new
         * PriorityQueue<>(Comparator.reverseOrder());
         * // for reverse order
         * PriorityQueue<Integer> pq = new PriorityQueue<>();
         * 
         * pq.add(3);
         * pq.add(4);
         * pq.add(1);
         * pq.add(7);
         * 
         * while (!pq.isEmpty()) {
         * System.out.println(pq.peek());
         * pq.remove();
         * }
         */

        PriorityQueue<Student> pq = new PriorityQueue<>(); // <>(Comparator.reverseOrder()); for reverse order

        pq.add(new Student("A", 4));
        pq.add(new Student("S", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("T", 8));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "-->" + pq.peek().rank);
            pq.remove();
        }

    }

}

import java.util.LinkedList;

// import java.util.*;
public class LLfromJCF {

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return merged.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next != null) {
            return head;
        }
        // find mid
        Node mid = getMid();
        // left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        // create -- objects only int, float, boolean --> Integer, Float, Character
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        // 0-->1-->2
        System.out.println(ll); // print
        ll.add(2, 43);
        ll.add(3, 34);
        System.out.println(ll);

        // remove
        // ll.removeLast();
        // ll.removeFirst();
        // System.out.println(ll);
        ll.remove(2);
        System.out.println(ll);
        ll.add(4, 59);
        ll.add(5, 9);
        System.out.println(ll);

    }
}

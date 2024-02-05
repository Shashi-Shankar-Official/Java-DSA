import java.util.*;

public class StackB {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data); // it will automatically add the data to the last of the arrayList.

        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1; // This will represent that our stack is empty.
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1; // This will represent that our stack is empty.
            }
            int top = list.get(list.size() - 1);
            return top;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}

import java.util.ArrayList;

public class HeapsOriginal {

    public static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);

            int child = arr.size() - 1;
            int parent = (child - 1) / 2;

            while (child > 0 && arr.get(child) < arr.get(parent)) {
                // swap
                int temp = arr.get(child);
                arr.set(child, arr.get(parent));
                arr.set(parent, temp);

                child = parent;
                parent = (child - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minidx = i;

            if (left < arr.size() && arr.get(minidx) > arr.get(left)) {
                minidx = left;
            }

            if (right < arr.size() && arr.get(minidx) > arr.get(right)) {
                minidx = right;
            }

            if (minidx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                heapify(minidx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // delete last
            arr.remove(arr.size() - 1);

            // heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}

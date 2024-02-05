import java.util.*;

public class BSTpart2 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public static Node createBST(int arr[], int st, int end) {
    public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        // Node root = new Node(arr[mid]);
        Node root = new Node(inorder.get(mid));
        // root.left = createBST(arr, st, mid - 1);
        root.left = createBST(inorder, st, mid - 1);
        // root.right = createBST(arr, mid + 1, end);
        root.right = createBST(inorder, mid + 1, end);

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void getinorder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }

        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
    }

    public static Node balancedBST(Node root) {
        // inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getinorder(root, inorder);

        // sorted inorder -> balanced BST

        createBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {

            return new Info(false, size, min, max);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static Node mergeBSTs(Node root1, Node root2) {
        // step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getinorder(root1, arr1);

        // step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getinorder(root2, arr2);

        // step3- merge
        int i = 0, j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                arr.add(arr1.get(i));
            } else {
                arr.add(arr2.get(j));
            }
        }

        while (i < arr1.size()) {
            arr.add(arr1.get(i));
        }

        while (j < arr2.size()) {
            arr.add(arr2.get(j));
        }

        // step4
        return createBST(arr, 0, arr.size() - 1);
    }

    public static void main(String[] args) {
        /*
         * int arr[] = { 3, 5, 6, 8, 10, 11, 12 };
         * 
         * Node root = createBST(arr, 0, arr.length - 1);
         * 
         * inorder(root);
         * 
         */

        /*
         * Node root = new Node(8);
         * root.left = new Node(6);
         * root.left.left = new Node(5);
         * root.left.left.left = new Node(3);
         * 
         * root.right = new Node(10);
         * root.right.right = new Node(11);
         * root.right.right.right = new Node(12);
         * 
         * root = balancedBST(root);
         * inorder(root);
         */

        /*
         * Node root = new Node(50);
         * root.left = new Node(30);
         * root.left.left = new Node(5);
         * root.left.right = new Node(20);
         * 
         * root.right = new Node(60);
         * root.right.left = new Node(45);
         * root.right.right = new Node(70);
         * root.right.right.left = new Node(65);
         * root.right.right.right = new Node(80);
         * 
         * Info info = largestBST(root);
         * System.out.println("largest BST size = " + maxBST);
         */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        inorder(root);

    }

}

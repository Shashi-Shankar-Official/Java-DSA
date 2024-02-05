import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class HeightBT {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    // public static int height(Node root) {
    // if (root == null) {
    // return 0;
    // }
    // int lh = height(root.left);
    // int rh = height(root.right);
    // int ht = Math.max(lh, rh);
    // return ht + 1;
    // }

    // public static int count(Node root) {
    // if (root == null) {
    // return 0;
    // }
    // int lc = count(root.left);
    // int rc = count(root.right);
    // int tc = lc + rc + 1;
    // return tc;
    // }

    // public static int sum(Node root) {
    // if (root == null) {
    // return 0;
    // }
    // int ls = sum(root.left);
    // int rs = sum(root.right);
    // int ts = ls + rs + root.data;

    // return ts;
    // }

    // public static int diameter2(Node root) {
    // if (root == null) {
    // return 0;
    // }
    // int ldiam = diameter2(root.left);
    // int rdiam = diameter2(root.right);
    // int rh = height(root.right);
    // int lh = height(root.left);
    // int selfdiam = rh + lh + 1;
    // // int ans = Math.max(rh, lh);
    // // int dia = Math.max(selfdiam, ans);
    // int dia = Math.max(selfdiam, Math.max(lh, rh));
    // return dia;
    // }

    // static class Info {
    // int diam;
    // int ht;

    // public Info(int diam, int ht) {
    // this.diam = diam;
    // this.ht = ht;
    // }
    // }

    // public static Info diameter(Node root) {
    // if (root == null) {
    // return new Info(0, 0);
    // }

    // Info leftInfo = diameter(root.left);
    // Info rightInfo = diameter(root.right);

    // int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht +
    // rightInfo.ht + 1);
    // int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

    // return new Info(diam, ht);

    // }

    // public static boolean isIdentical(Node root, Node subroot) {
    // if (root == null && subroot == null) {
    // return true;
    // } else if (root == null || subroot == null || root.data != subroot.data) {
    // return false;
    // }

    // if (!isIdentical(root.left, subroot.left)) {
    // return false;
    // }
    // if (!isIdentical(root.right, subroot.right)) {
    // return false;
    // }

    // return true;
    // }

    // public static boolean isSubtree(Node root, Node subroot) {
    // if (root == null) {
    // return false;
    // }

    // if (root.data == subroot.data) {
    // if (isIdentical(root, subroot)) {
    // return true;
    // }
    // }
    // // boolean leftAns = isSubtree(root.left, subroot);
    // // boolean rightAns = isSubtree(root.right, subroot);
    // // return leftAns || rightAns;

    // return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    // }

    // public static void klevel(Node root, int level, int k) {
    // if (root == null) {
    // return;
    // }

    // if (level == k) {
    // System.out.print(root.data + " ");
    // return;
    // }

    // klevel(root.left, level + 1, k);
    // klevel(root.right, level + 1, k);
    // }

    // public static boolean getPath(Node root, int n, ArrayList<Node> path) {
    // if (root == null) {
    // return false;
    // }

    // path.add(root);

    // if (root.data == n) {
    // return true;
    // }

    // boolean foundleft = getPath(root.left, n, path);
    // boolean foundright = getPath(root.right, n, path);

    // if (foundleft || foundright) {
    // return true;
    // }

    // path.remove(path.size() - 1);
    // return false;
    // }

    // public static Node lca(Node root, int n1, int n2) {
    // ArrayList<Node> path1 = new ArrayList<>();
    // ArrayList<Node> path2 = new ArrayList<>();

    // getPath(root, n1, path1);
    // getPath(root, n2, path2);

    // // last common ancestor
    // int i = 0;
    // for (; i < path1.size() && i < path2.size(); i++) {
    // if (path1.get(i) != path2.get(i)) {
    // break;
    // }
    // }

    // // last equal node -> i-1th
    // Node lcaa = path1.get(i - 1);
    // return lcaa;
    // }

    // public static Node lca2(Node root, int n1, int n2) {

    // if (root == null || root.data == n1 || root.data == n2) {
    // return root;
    // }

    // Node leftlca = lca2(root.left, n1, n2);
    // Node rightlca = lca2(root.right, n1, n2);

    // // leftlca = val , rightlca = null
    // if (rightlca == null) {
    // return leftlca;
    // } else if (leftlca == null) {
    // return rightlca;
    // }

    // return root;
    // }

    // public static int lcaDist(Node root, int n) {
    // if (root == null) {
    // return -1;
    // }

    // if (root.data == n) {
    // return 0;
    // }

    // int leftDist = lcaDist(root.left, n);
    // int rightDist = lcaDist(root.right, n);

    // if (leftDist == -1 && rightDist == -1) {
    // return -1;
    // } else if (leftDist == -1) {
    // return rightDist + 1;
    // } else {
    // return leftDist + 1;
    // }
    // }

    // public static int mindis(Node root, int n1, int n2) {
    // Node lca = lca2(root, n1, n2);
    // int dist1 = lcaDist(lca, n1);
    // int dist2 = lcaDist(lca, n2);

    // return dist1 + dist2;
    // }

    // public static int KAncestor(Node root, int n, int k) {
    // if (root == null) {
    // return -1;
    // }

    // if (root.data == n) {
    // return 0;
    // }
    // int leftDist = KAncestor(root.left, n, k);
    // int rightDist = KAncestor(root.right, n, k);

    // if (leftDist == -1 && rightDist == -1) {
    // return -1;
    // }

    // int max = Math.max(leftDist, rightDist);
    // if (max + 1 == k) {
    // System.out.println(root.data);
    // }
    // return max + 1;
    // }

    // public static int transform(Node root) {

    // if (root == null) {
    // return 0;
    // }

    // int leftchild = transform(root.left);
    // int rightchild = transform(root.right);

    // int data = root.data;

    // int newLeft = root.left == null ? 0 : root.left.data;
    // int newRight = root.right == null ? 0 : root.right.data;
    // root.data = leftchild + rightchild + newLeft + newRight;
    // return data;
    // }

    // public static void preorder(Node root) {
    // if (root == null) {
    // // System.out.print(-1 + " ");
    // return;
    // }
    // System.out.print(root.data + " ");
    // preorder(root.left);
    // preorder(root.right);
    // }

    static class Info2 {

        Node node;
        int hd;

        public Info2(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }

    }

    public static void TopView(Node root) {
        // level order
        Queue<Info2> q = new LinkedList<Info2>();

        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info2(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info2 curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info2(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info2(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);

        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);

        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root));
        // System.out.println(diameter2(root));
        // System.out.println(diameter(root).diam);
        // System.out.println(diameter(root).ht);
        // System.out.println(isSubtree(root, subroot));

        // int k = 2;
        // klevel(root, 1, k);

        // int n1 = 4;
        // int n2 = 7;
        // System.out.println(lca(root, n1, n2).data);

        // System.out.println(lca2(root, n1, n2).data);

        // System.out.println(mindis(root, n1, n2));

        // System.out.println(KAncestor(root, n1, n2));

        // transform(root);
        // preorder(root);

        // Top View of Binary Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        TopView(root);
    }

}
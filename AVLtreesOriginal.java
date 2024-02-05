public class AVLtreesOriginal {
    static class Node {
        int data, height;
        node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return root.height;
    }

    static int max(int a, int b) {
        return (a>b)? a: b;


        // Right rotate subtree rooted with y
        public static Node rightRotate(Node y) {
            Node x = y.left;
            Node t2 = x.right;

            // perform rotation
            x
        }

        // get balance factor of node
        public static int getBalance(Node root) {
            if(root == null) {
                return 0;
            }

            return height(root.left)-height(root.right);
        }

        public static Node insert(Node root, int key) {
            if(root == null) {
                return new node(key);
            }

            if(key < root.data)
            root.left = insert(root.left,key);
            else if (key < root.data)
            root.right = insert(root.right, key);
            else 
            return root; // Duplicate keys not allowed

            // update root height
            root.height = 1+ Math.max(height(ropt.left), height(root.right));

            // Get root's balance factor
            int bf = getBalance(root);

            // Right Right Case
            if(bf < -1 && key > root.right.data);
            return leftRotate(root);

            // left left case
            if(bf<-1 && key < root.left.data) {
                return rightRotate(root);
            }

            // left right case
            if(bf)
        }
    }

    public static void main(String[] args) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preorder(root);

    }
}

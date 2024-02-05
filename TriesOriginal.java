public class TriesOriginal {

    static class Node {
        Node childern[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                childern[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.childern[idx] == null) {
                curr.childern[idx] = new Node();
            } else {
                // do nothing
            }

            curr = curr.childern[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.childern[idx] == null) {
                return false;
            }
            curr = curr.childern[idx];
        }

        if (curr.eow == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean wordBreak(String key) {

        // base case
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            // substring(beginging index, last index) i.e., o to 1
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }

        }
        return false;
    }

    public static boolean startsWith(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.childern[idx] == null) {
                return false;
            }
            curr = curr.childern[idx];
        }

        return true;

    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.childern[i] != null) {
                count += countNodes(root.childern[i]);
            }
        }
        return count + 1;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.childern[i] != null && root.childern[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.childern[i], temp);
                temp.deleteCharAt(temp.length() - 1);// backtrack
            }
        }
    }

    public static void main(String[] args) {
        /*
         * String words[] = { "the", "a", "there", "their", "any", "thee" };
         * for (int i = 0; i < words.length; i++) {
         * insert(words[i]);
         * }
         * 
         * System.out.println(search("there"));
         */

        /*
         * String arr[] = { "i", "like", "samsung", "mobile", "ice" };
         * for (int i = 0; i < arr.length; i++) {
         * insert(arr[i]);
         * }
         * 
         * String key = "ilikesamsung";
         * System.out.println(wordBreak(key));
         */

        /*
         * String words[] = { "apple", "app", "mango", "woman" };
         * for (int i = 0; i < words.length; i++) {
         * insert(words[i]);
         * }
         * 
         * String prfix = "app";
         * System.out.println(startsWith(prfix));
         */

        String str = "bcdaaaabcdaaaa"; // ans=10;

        // sugix ->insert in trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNodes(root));

        // String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        // for (int i = 0; i < words.length; i++) {
        // insert(words[i]);
        // }

        // longestWord(root, new StringBuilder(""));
        // System.out.println(ans);
    }
}
public class RDublicates {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, Boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);

        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        String str = "appnnacollage";
        boolean map[] = new boolean[26];
        StringBuilder newStr = new StringBuilder("");
        removeDuplicates(str, 0, newStr, map);

    }

}

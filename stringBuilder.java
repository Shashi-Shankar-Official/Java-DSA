public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        } // abcdefghijklmnopqrstuvwxyz
        System.out.println(sb);
        System.out.print(sb.length());

    }

}

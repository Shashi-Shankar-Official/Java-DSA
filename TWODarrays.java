import java.util.*;

public class TWODarrays {

    public static void search(int matrix[][], int key) {

        Scanner sc = new Scanner(System.in);

        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.print(i + " " + j);
                }
            }

        }

    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("type the number which index you want to know : ");
        int key = sc.nextInt();

        search(matrix, key);
    }

}

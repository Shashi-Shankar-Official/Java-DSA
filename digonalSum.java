public class digonalSum {

    public static int diagonalsummation(int matrix[][]) {
        int sum = 0;
        int n = (matrix.length - 1) / 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // primary diagonal
                if (i == j) {
                    sum += matrix[i][j];
                }

                // secondary diagonal
                if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
                /*
                 * if ((matrix.length - 1) % 2 != 0) {
                 * sum -= matrix[n][n];
                 * 
                 * }
                 */
            }
        }
        return sum;
    }

    public static int altdiagonalsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
            sum = sum + matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(altdiagonalsum(matrix));
    }

}

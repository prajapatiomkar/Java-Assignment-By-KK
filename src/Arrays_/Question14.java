//1252. Cells with Odd Values in a Matrix
package Arrays_;

import java.util.Arrays;

public class Question14 {
    public static void main(String[] args) {
        int[][] indices = {
                {1,1},
                {0,0}
        };
        int m, n;
        m = 2;
        n = 2;
        System.out.println(oddCells(m, n, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                if (j == 0) {
                    for (int k = 0; k < n; k++) {
                        matrix[indices[i][j]][k] += 1;
                    }
                } else {
                    for (int k = 0; k < m; k++) {
                        matrix[k][indices[i][j]] += 1;
                    }
                }
            }
        }
        int isOdd = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    isOdd++;
                }
            }
        }
        return isOdd;
    }
}

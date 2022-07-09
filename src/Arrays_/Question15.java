package Arrays_;
//1572. Matrix Diagonal Sum
public class Question15 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        if (n == 1) {
            return mat[0][0];
        }

        int sum = 0;

        for (int i = 0, j = n - 1; i < n; i++, j--) {
            sum += mat[i][i];
            if (i != j) {
                sum += mat[i][j];
            }
        }

        return sum;
    }
}

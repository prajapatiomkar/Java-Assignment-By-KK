package Arrays_;

import java.util.Arrays;

//867. Transpose Matrix
public class Question17 {
    public static void main(String[] args) {
//        int[][] matrix ={ {1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] ans = transpose(matrix);
        for (int[] i : ans) {
            System.out.println(Arrays.toString(i));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] ans = new int[n][m];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                ans[j][i] = matrix[i][j];
            }
        }return ans;
    }
}

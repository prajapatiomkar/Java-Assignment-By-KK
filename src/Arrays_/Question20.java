//1886. Determine Whether Matrix Can Be Obtained By Rotation
package Arrays_;

import java.util.Arrays;

public class Question20 {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0}
        };

        System.out.println(findRotation(arr,target));

    }
    static boolean findRotation(int[][] mat, int[][] target) {
        if(isRightRotated(mat,target)){
            return true;
        }
        if(isDoubleRightRotated(mat,target)){
            return true;
        }
//        if(isLeftRotated(mat,target)){
//            return true;
//        }
//        if(isSame(mat,target)){
//            return true;
//        }
        return false;
    }

    static boolean isRightRotated(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[j][n - i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isDoubleRightRotated(int[][] mat, int[][] target){
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[n-i-1][n-1-j]){
                    return false;
                }
            }
        }
        return true;
    }
}

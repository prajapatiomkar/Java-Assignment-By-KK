package Arrays_;

import java.util.ArrayList;
import java.util.List;

public class Question23 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}
        };


        System.out.println(luckyNumbers(matrix));
    }


    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int index[] = {i, 0};
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    index[0] = i;
                    index[1] = j;
                    min = matrix[i][j];
                }
            }
            int maxCol = min;

            for (int k=0;k<matrix.length;k++){
                if (matrix[k][index[1]]>min){
                    maxCol = matrix[k][index[1]];
                    break;
                }
            }
            if( maxCol == min) // At the end minRow and maxRow both are same it means it is a magical number.
            {
                list.add(min); //  we found magical number.Add this number to list
                break;
            }


        }
        return list;
    }


}

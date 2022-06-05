//832. Flipping an Image
package Arrays_;

import java.util.Arrays;

public class Question13 {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 0, 1, 0}
        };
        for (int[] imgArr : flipAndInvertImage(image)) {
            System.out.println(Arrays.toString(imgArr));
        }
    }

//    To flip an image horizontally means that each row of the image is reversed.  Row <-> Reverse [1,1,0] [0,1,1]

    //    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. [1,1,0] [0,0,1] 1<->0
    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                result[i][j] = inverse(image[i][n - 1 - j]);
            }
        }
        return result;
    }

    static int inverse(int i) {
        if (i == 1) {
            return 0;
        }
        return 1;
    }
}

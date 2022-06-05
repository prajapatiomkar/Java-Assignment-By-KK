//1929. Concatenation of Array
package Arrays_;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,8,6,7};
        System.out.println(Arrays.toString(concatenation(arr)));

    }

    private static int[] concatenation(int[] arr) {
        int[] arrays = new int[arr.length*2];
        
        for (int i=0;i<arr.length;i++){
            arrays[i] = arr[i];
            arrays[i+arr.length] = arr[i];
        }return arrays;
    }


}

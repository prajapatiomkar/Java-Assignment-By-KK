//1470. Shuffle the Array
package Arrays_;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        System.out.println(Arrays.toString(shuffleArray(arr, n)));
    }
    private static int[] shuffleArray(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for (int i = 0; i<n; i++) {
            answer[i*2] = arr[i];
            answer[i*2+1] = arr[i + n];
        }
        return answer;
    }

}

package Arrays_;

import java.util.Arrays;

public class Question22 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(Arrays.toString(sumZero(n)));
    }

    private static int[] sumZero(int n) {
        int[] result = new int[n];
        int sum = 0;
        for (int i = 1; i < n; i++) {
            result[i] = i;
            sum += i;
        }
        sum = -(sum);
        result[0] = sum;

        return result;
    }
}

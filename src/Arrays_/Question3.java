//1480. Running Sum of 1d Array
package Arrays_;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
//      expected Output is  [1,3,6,10]
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSums(arr)));
    }
    private static int[] runningSums(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            result[i] = sum;
        }
        return result;
    }
}

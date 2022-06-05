//1365.How Many Numbers Are Smaller Than the Current Number
package Arrays_;

import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int currentCount = 0;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    currentCount++;
                }
            }
            answer[i] = currentCount;
            currentCount = 0;
        }
        return answer;
    }
}

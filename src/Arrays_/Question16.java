package Arrays_;

//1295. Find Numbers with Even Number of Digits
public class Question16 {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));

    }

//    static int findNumbers(int[] nums) {
//        int store = 0;
//        int cnt = 0;
//        for (int i : nums) {
//            store = (int) Math.abs(Math.log10(i) + 1);
//            if (store % 2 == 0) {
//                cnt++;
//            }
//
//        }
//        return cnt;
//    }

    static int findNumbers(int[] nums){
        int count = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            int no = nums[i];
            if(no>9 && no <100)
            {
                ans++;
                continue;
            }

            if(no>999 && no<10000)
            {
                ans++;
                continue;
            }

            if(no==100000)
                ans++;
        }
        return ans;
    }
}

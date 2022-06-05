package Arrays_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        int[] arr = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> ans = greatestNumberOfCandies(arr,extraCandies);
        System.out.println(ans);
    }

    private static List<Boolean> greatestNumberOfCandies(int[] arr, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int Maxi = -99;
        for (int i=0;i<arr.length;i++){
            Maxi =maxInt(Maxi,arr[i]);
        }
        for (int candy :arr){
            answer.add(candy>=Maxi-extraCandies);
        }
        return answer;
    }

    private static int maxInt(int maxi, int i) {
        if (maxi>i){
            return maxi;
        }else {
            return i;
        }
    }
}

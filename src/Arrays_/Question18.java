package Arrays_;
//989. Add to Array-Form of Integer

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question18 {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int k = 1;

        System.out.println(addToArrayForm(arr, k));

    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = num.length;
        int carry = 0;
        int sum;
        int toAdd;
        for (int i = n - 1; i >= 0; i--) {
            sum = num[i] + k % 10 + carry;
            toAdd = sum % 10;
            carry = sum / 10;
            k = k / 10;
            ans.add(toAdd);
        }

        while (k > 0) {
            sum = k % 10 + carry;
            toAdd = sum % 10;
            carry = sum / 10;
            k = k / 10;
            ans.add(toAdd);
        }
        if (carry != 0) {
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;

    }


}

//package DemoQuestions;
//
//public class Coins {
//    public static void main(String[] args) {
//        int[] coins = {1, 2, 5};
//        int amount = 11;
//        System.out.println(coinChange(coins, amount));
//    }
//
//    static int coinChange(int[] coins, int amount) {
//        if (amount == 0) {
//            return 0;
//        }
//        int ans = 0;
//        for (int i = 0; i < coins.length; i++) {
//            if (amount - coins[i] >= 0) {
//                int res = coinsNeeded(coins, amount - coins[i]);
//                if (res == 0){
//                    continue;
//                }
//                ans = Math.min(res+1,ans);
//            }
//
//        }return ans;
//    }
//
//    private static int coinsNeeded(int[] coins, int i) {
//        int n = coins.length;
//        int res =  coinsNeeded(coins,i);
//        if (res == 0){
//            return res;
//        }
//    }
//}

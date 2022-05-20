//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

package Functions;

public class Question1 {
    public static void main(String[] args) {
        int a, b, c;
        a = 15;
        b = 24;
        c = 13;
        System.out.println("Max Number ->" + maxNo(a, b, c));
        System.out.println("Min Number ->" + minNo(a, b, c));
    }

//    private static int minNo(int a, int b, int c) {
//        int Min = 0;
//        if (a < b) {
//            if (a < c) {
//                Min = a;
//            } else {
//                Min = c;
//            }
//        } else {
//            if (b < c) {
//                Min = b;
//            } else {
//                Min = c;
//            }
//        }
//        return Min;
//    }
//
//    private static int maxNo(int a, int b, int c) {
//        int Max = 0;
//        if (a > b) {
//            if (a > c) {
//                Max = a;
//            } else {
//                Max = c;
//            }
//        } else {
//            if (b > c) {
//                Max = b;
//            } else {
//                Max = c;
//            }
//        }
//        return Max;
//    }

    private static int minNo(int a, int b, int c) {
        int Min = a;
        if (b < Min) {
            Min = b;
        }
        if (c < Min) {
            Min = c;
        }
        return Min;
    }

    private static int maxNo(int a, int b, int c) {
        int Max = a;
        if (b>Max){
            Max = b;
        }
        if (c>Max){
            Max = c;
        }
        return Max;
    }
}

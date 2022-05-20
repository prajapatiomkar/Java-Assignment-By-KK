//Define a program to find out whether a given number is even or odd.
package Functions;

public class Question2 {
    public static void main(String[] args) {
        int no = 0;
        if (isEvenOrOdd(no)){
            System.out.println("The given no is Even");
        }else {
            System.out.println("The given no is Odd");
        }
    }
    private static boolean isEvenOrOdd(int no) {
        boolean isEven = false;
        if (no % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }
}

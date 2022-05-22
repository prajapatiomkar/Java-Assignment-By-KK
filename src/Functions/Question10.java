//Write a function to find if a number is a palindrome or not. Take number as parameter.
package Functions;

public class Question10 {
    public static void main(String[] args) {
        int no = 121;
        if (isPalindrome(no)) {
            System.out.println("Given no is palindrome");
        } else {
            System.out.println("Given no is not palindrome");
        }
    }
    private static boolean isPalindrome(int no) {
        int rem, sum = 0, temp;
        temp = no;
        while (no > 0) {
            rem = no % 10;
            sum = (sum * 10) + rem;
            no = no / 10;
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }

}

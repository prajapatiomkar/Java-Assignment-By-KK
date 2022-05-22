//Define a method to find out if a number is prime or not.
package Functions;

public class Question7 {
    public static void main(String[] args) {
        int no = 11;
        if (isPrime(no)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

    }

    private static boolean isPrime(int no) {
        if (no <= 1) {
            return false;
        }
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//Write a function that returns the sum of first n natural numbers.
package Functions;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        System.out.println(sumOfN());
    }
    private static int sumOfN() {
        System.out.println("Enter No and Hit Enter");
        System.out.println("To End Program enter 00");
        Scanner scanner = new Scanner(System.in);
        int ans = 0;
        while (true) {
            int no = scanner.nextInt();
            if (no==00){
                break;
            }
            ans = ans+no;
        }return ans;
    }
}

//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
package Functions;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Number");
            int factNo = scanner.nextInt();
            if (factNo == -1){
                System.out.println("----THE END----");
                return;
            }
            System.out.println("Factorial of "+factNo+" is "+Factorial(factNo));

        }
    }

    private static int Factorial(int factNo) {
        int result = 1;
        int temp = factNo;
        while (temp != 0) {
            result = result * temp;
            temp--;
        }
        return result;
    }
}

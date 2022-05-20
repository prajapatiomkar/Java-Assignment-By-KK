//Write a program to print the sum of two numbers entered by user by defining your own method.
package Functions;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter 1st No");
        a = scanner.nextInt();
        System.out.println("Enter 2st No");
        b = scanner.nextInt();
        System.out.println("Your Answer");
        System.out.println(sumOfNo(a,b));
    }
    private static int sumOfNo(int a, int b) {
        return a+b;
    }
}

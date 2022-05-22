//Define a method that returns the product of two numbers entered by user.
package Functions;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter 1st NO");
        a = scanner.nextInt();
        System.out.println("Enter 2st NO");
        b = scanner.nextInt();
        System.out.println("Your ans is");
        System.out.println(productOfTwoNo(a, b));
    }

    private static int productOfTwoNo(int a, int b) {
        return a * b;
    }
}

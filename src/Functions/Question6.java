//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package Functions;

import java.util.Scanner;

public class Question6 {
    final static float PI = 3.142f;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius =scanner.nextInt();
        System.out.println("Circumference of a circle");
        System.out.printf("%.2f",circumference(radius));
        System.out.println();
        System.out.println("Area of a circle");
        System.out.printf("%.2f",area(radius));
    }

    private static float area(int radius) {
        return 2*PI*radius;
    }

    private static float circumference(int radius) {
        return PI*radius*radius;
    }
}

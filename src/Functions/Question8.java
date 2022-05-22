//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
package Functions;

import java.rmi.MarshalException;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        System.out.println(giveResult(marks));
    }

    private static String giveResult(int marks) {

        if (marks>=91 && marks<=100){
            return "AA";
        }else if (marks>=81 && marks<=90){
            return "AB";
        }else if (marks>=71 && marks<=80){
            return "BB";
        }else if (marks>=61 && marks<=70){
            return "BC";
        }else if (marks>=51 && marks<=60){
            return "CD";
        }else if (marks>=41 && marks<=50){
            return "DD";
        }else {
            return "Fail";
        }
    }

}

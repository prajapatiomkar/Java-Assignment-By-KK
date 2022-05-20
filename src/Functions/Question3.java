//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package Functions;

public class Question3 {
    public static void main(String[] args) {
        int age = 17;
        if(voterEligible(age)){
            System.out.println("You are eligible for Vote");
        }else{
            System.out.println("You are not eligible for Vote");
        }
    }
    private static boolean voterEligible(int age) {
        if (age>=18){
            return true;
        }else {
            return false;
        }
    }
}

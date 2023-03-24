package chapter5;

import java.util.Scanner;

/*
VARIABLE SCOPE
Wirte an instant credit check program that approves anyone who make more than $25,000
and has a credit score of 700 or better. Reject all tohers.
 */
public class InstantCreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        //Initialize what we know

        //Get what we dont know
        double salary = getSalary();      //can name 'sal'
        int creditScore = getCreditScore(); //can name 'cs'
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);  //here pass 'sal', 'cs'

        //Notify the user
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary: ");

        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
             System.out.println("Congrats! You have been approved.");
        }
        else {
            System.out.println("Sorry, you have been declined!");
            }
        }
}

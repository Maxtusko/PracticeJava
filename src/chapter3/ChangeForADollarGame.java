package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String args[]){

        int penny = 1;
        int nickle = 5;
        int dime = 10;
        int quarter = 25;
        int dollar = 100;

        System.out.println("How many pennies would you like? ");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickles would you like? ");
        int nickles = scanner.nextInt();

        System.out.println("How many dimes would you like? ");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters would you like? ");
        int quarters = scanner.nextInt();

        scanner.close();

        int totalCount = pennies * penny + nickles * nickle + dimes * dime + quarters * quarter;

        if (totalCount < dollar){
            int amountUnder = dollar - totalCount;
            System.out.println("You underpaid by " + amountUnder + " cents");
        }
        else if (totalCount > dollar){
            int amountOver = totalCount - dollar;
            System.out.println("You overpaid by " + amountOver + " cents");
        }
        System.out.println("Congrats! You paid exactly $1!");
        }
    }

package chapter3;


import java.util.Scanner;

/*
IF ELSE
All salesmen are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don`t, they are informed of how many sales they were short.
 */
public class QuotaCalculator {

    public static void main(String args[]){

        //Initialize values we know
        int quota = 10;

        //Get unknow values
        System.out.println("Enter the number of sales made in a week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path ot take - Output
        if (sales  >= quota)
            System.out.println("Congratulations! You have met the sales benchmark.");
        else {
            int salesShort = quota - sales;
            System.out.println("You have not met the sales benchmark! You were " + salesShort + " sales short from the benchmark.");
        }
    }
}

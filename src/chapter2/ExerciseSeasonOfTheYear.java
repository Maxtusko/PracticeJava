package chapter2;

import java.util.Scanner;

public class ExerciseSeasonOfTheYear {

    public static void main(String args[]){

        //Ask for a season of the year
        System.out.print("What is a current season of a year?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Ask for adjective
        System.out.print("Throw in some adjective:");
        String randomAdjective = scanner.next();

        //Ask for adjective
        System.out.print("Input your favourite number here:");
        int randomNumber = scanner.nextInt();
        scanner.close();

        //Display the whole sentence
        System.out.print("On a " + randomAdjective + " " + season + " day, I drink a minimum of " + randomNumber + " cups of coffe.");
    }
}

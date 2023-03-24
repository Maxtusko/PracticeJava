package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDiceGame {

    public static void main(String args[]){

        //Roll dice - random number
        Random random = new Random();

        int dieRolls = 5;
        int rolledSpaces = 0;
        int spaces = 0;
        int boardSpaces = 20;

        //Scanner scanner = new Scanner(System.in);

        for (int i=0; i<dieRolls; i++){
            int roll = random.nextInt(6) + 1;
            int rolledTimes = i+1;

            spaces = spaces + roll;
            rolledSpaces = rolledSpaces + roll;
            int overSpaces =  spaces - boardSpaces;
            int underSpaces = boardSpaces - spaces;

            System.out.println("Roll # " + rolledTimes + ". You have rolled a " + roll + ". You are now on space " + spaces);
                if (rolledTimes == dieRolls && spaces < boardSpaces){
                    System.out.println("You lost! You have used all 5 rolls and rolled " + spaces + " in total, going " + underSpaces + " under.");
                } else if (rolledTimes == dieRolls && spaces > boardSpaces){
                    System.out.println("You lost! You have used all 5 rolls and rolled " + spaces + " in total, going " + overSpaces + " over.");
                } else if (spaces == boardSpaces){
                    System.out.println("Congrats you won! You have rolled " + boardSpaces + "!");
                }
        }
    }
}
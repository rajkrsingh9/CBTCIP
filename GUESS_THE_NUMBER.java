package CBTCIP;

import java.util.Random;
import java.util.Scanner;

/**
 * GUESS_THE_NUMBER
 */
public class GUESS_THE_NUMBER {

    public static void main(String[] args) {
         Random randNumber = new Random();

         int randomNumber = randNumber.nextInt(101);
         System.out.println("Enter your Guess (0-100):");
         System.out.println("You have 5 attempts");

         Scanner sc = new Scanner(System.in);
         int attempCount=1;
         while(attempCount<=5){
         int playerGuess = sc.nextInt();
         if(playerGuess==randomNumber){
            System.out.println("Congratulations you won at your "+attempCount+" attempt");
            break;
         }
         System.out.println(result(playerGuess, randomNumber)+ " Attempt Count: "+attempCount++);

         }
         

    }
    public static String result(int guess, int randomNumber){
        if(guess>randomNumber && guess<=100){
            return "Higher";
        }
        else if(guess>100){
            return "Too Far from right guess";
        }
        else if(guess<0){
            return "Too Low from right guess";
        }
        else if(guess>=0 && guess<randomNumber){
            return "Lower";
        }
        return " ";
    }
}
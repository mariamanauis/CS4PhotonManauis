/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haria Manauis
 */
import java.util.Scanner;
public class Ex02PhotonManauis {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String runAgain;
       
       int numberOfGuesses = 3;
       int upperLimit = 10;
       int randomMin = 1;
       int random = (int) Math.floor(Math.random()*(upperLimit-randomMin)) + randomMin;
       String stringUserGuess;
       int userGuess;
       String playAgain;
       do {
        System.out.println("Hello! Welcome to Higher or Lower! What will you do?");
        System.out.println("- Start Game");
        System.out.println("- Change Game Settings");
        System.out.println("- End Game");
        String gameMode = sc.nextLine();

        String stringUL;
        String stringLL;
        String stringGuessLimit;

        if(gameMode.equalsIgnoreCase("start game")){
             do{
                 System.out.println("You have " + numberOfGuesses+ 
                     " guess(es) left. What is your guess?");
                 for(int i = numberOfGuesses; i >= 1; --i){
                     stringUserGuess = sc.nextLine();
                     userGuess = Integer.parseInt(stringUserGuess);
                     if (userGuess == random && i >= 1) {
                         System.out.println("Yay! You got it!");
                         break;
                     }
                     else if (userGuess < random && i > 1) {
                         System.out.println("Guess higher! You have " 
                                 + (i-1) + " guess(es) left!");
                     }
                     else if (userGuess > random && i > 1) {
                         System.out.println("Guess lower! You have " 
                                 + (i-1) + " guess(es) left!");
                     }
                     if (userGuess != random && i == 1) {
                         System.out.println("You lost...");
                         break;
                     }
                 }
                 System.out.println("Do you want to play again? (y/n)");
                 playAgain = sc.nextLine();
             }while (playAgain.equalsIgnoreCase("y"));
             System.out.println("Thanks for playing!");
         }
         else if (gameMode.equalsIgnoreCase("change game settings")){
             System.out.println("What is the lower limit of the random number?");
             stringUL = sc.nextLine();
             upperLimit = Integer.parseInt(stringUL);
             System.out.println("What is the upper limit of the random number?");
             stringLL = sc.nextLine();
             randomMin = Integer.parseInt(stringLL);
             System.out.println("How many guesses are allowed?");
             stringGuessLimit = sc.nextLine();
             numberOfGuesses = Integer.parseInt(stringGuessLimit);
             System.out.println("Lower limit: " + randomMin);
             System.out.println("Upper Limit: " + upperLimit);
             System.out.println("Limit of Guesses: " + numberOfGuesses);

         }
         else if (gameMode.equalsIgnoreCase("end game")) {
             System.out.println("Thank you for playing!");
         }
         else {
             System.out.println("Mode not Found.");
         }

         System.out.println("Do you want to run the game again? (y/n)");
         runAgain = sc.nextLine();
       } while(runAgain.equalsIgnoreCase("y"));
   }
}

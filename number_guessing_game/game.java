package number_guessing_game;
import java.util.*;

/**
 * game
 */
public class game {

    public static void main(String[] args) {
        // INSTRUCTIONS
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        System.out.println("INSTRUCTIONS --");
        System.out.println("YOU WILL BE GIVEN A RANGE OF NUMBER IN WHICH YOU WILL HAVE TO GUESS THE NUMBER, IF YOU GUESSED IT RIGHT, YOU WON OTHERWISE, YOU LOST");
        System.out.println("YOU WILL HAVE 7 ATTEMPTS ONLY");
        System.out.println("LET'S START");

        //CODE
        Random rd=new Random();
        int randomNumber=rd.nextInt(100) +1;

        Scanner sc=new Scanner(System.in);
       

        int guesses=1;
       
        while(guesses<8){
            System.out.println("Enter a number between the range of 1-100");
            int playerGuess=sc.nextInt();
            guesses++;



        // COMPARING NUMBERS
        if(playerGuess>randomNumber){
            System.out.println("Enter a smaller number");
            System.out.println("Attempts left : "+(8-guesses));
        }
        else if(playerGuess<randomNumber){
            System.out.println("Enter a greater number");
            System.out.println("Attempts left : "+(8-guesses));
        }
        else if(playerGuess==randomNumber){
            System.out.println("Congratulations, you won the game in " +(guesses-1)+ "th  attempt");
            break;
        }
    }



    // GAME OVER 
    if((guesses)== 8){
        System.out.println("GAME OVER!!!");
        System.out.println("The number was : " + randomNumber);
       
    }
   


    }
}
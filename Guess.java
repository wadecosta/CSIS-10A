import java.util.*;

/**
 * Write a description of class Guess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Guess
{
    public static void main(String [] args)
    {
        System.out.println("I've got a number 0 to 100.");
        
        //Declare a scanner 
        Scanner keyboard = new Scanner(System.in);
        
        //Secret random number
        int secret = (int)(Math.round(100*Math.random()));
        
        // Store user's most recent guess
        int userGuess;
        int count = 0;
        do {
            System.out.println("What's your guess?");
            userGuess = keyboard.nextInt();
            if (userGuess > secret)
            {
                System.out.println("Guess lower.");
            }
            else if (userGuess < secret)
            {
                System.out.println("Guess higher.");
            }
            count = count + 1;
        } while (userGuess != secret);
        System.out.println("Got it in " + count + " guesses");
        
    }
}

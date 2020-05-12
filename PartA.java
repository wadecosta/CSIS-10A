import java.util.Scanner;
/**
 * Write a description of class PartA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartA
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Player 1, enter a secret word, from 3 - 10 letters");
        String secret = keyboard.next();
        
        //System.out.println("The secret word is " + secret);
        //System.out.println("It has " + secret.length() + " letters");
        //System.out.println("The first letter is " + secret.charAt(0));
        
        System.out.println("\f");
        String guess;
        int count = 0;
        do{
            System.out.println("Player 2, enter a guess, it should have " + secret.length() + " letters");
            guess = keyboard.next();
            if (guess.length() != secret.length())
            {
                System.out.println("Wrong number of letters!");
            }
            else
            {
                printCorrectLetters(secret, guess);
            }
            if ((count > 2) && (secret.charAt(0) != guess.charAt(0)))
            {
                System.out.println("The first letter is " + secret.charAt(0));
            }
            count++;
            
        } while (!guess.equals(secret));
        System.out.println("You got it in " + count + " guesses!");
    }
    
    public static void printCorrectLetters (String secret, String guess)
    {
        int index = 0;
        char s, g;
        while (index < secret.length())
        {
            s = secret.charAt(index);
            g = guess.charAt(index);
            if (s == g)
            {
                System.out.print(s);
            }
            else
            {
                System.out.print("-");
            }
            index++;
        }
        System.out.println("");
    }
}

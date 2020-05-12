
/**
 * Write a description of class Sandwich here.
 *
 * Wade Costa
 * 3-1-18
 */

import java.util.Scanner;


public class Sandwich
{
    public static void main (String [] args)
    {
        int q = 5;
        do {
            System.out.println("");
            System.out.println("Next customer!");
            burger();
            q = q - 1;
        } while (q > 0);
    }
    public static void burger()
    {
        // Print the Hamburger Place sign.
        System.out.println("******************************");
        int line = 0;
        while(line < 5)
        {
            System.out.println("*                            *");
            line = line + 1;
        }
        System.out.println("*   Wade's Hamburger Place   *");
        while(line < 10)
        {
            System.out.println("*                            *");
            line = line + 1;
        }
        System.out.println("******************************");
        
        
        // Create a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);
        
        
        // Ask how much of the toppings the user wants (no negative numbers!)
        int lettuce;
        do {
            System.out.println("How many layers of lettuce do you want?");
            lettuce = keyboard.nextInt();
        } while (lettuce < 0);
        
        int tomato;
        do {
            System.out.println("How many layers of tomatoes do you want?");
            tomato = keyboard.nextInt();
        } while (tomato < 0);
        
        // Print the bun
        System.out.println("Here's your sandwich:");
        System.out.println("");
        System.out.println("(________)");
        
        // this while loop should repeat as many times as the number stored in variable lettuce
        line = 0;
        while (lettuce > 0)
        {
            System.out.println(" ~~~~~~~~");
            line = line + 1;
            lettuce = lettuce - 1;

        }
        
        while (tomato > 0)
        {
            System.out.println(" [ ]  [ ]");
            line = line + 1;
            tomato = tomato - 1;
        }
        System.out.println(" ********");
        System.out.println("(________)");
    }

   
}

import java.util.*;
/**
 * Write a description of class Checkout here.
 *
 * Wade Costa
 * 03-03-18
 */


public class Checkout
{
    public static void main (String [] args)
    {
        // Create Scanner object and print greeting
        Scanner keyboard = new Scanner(System.in);
        System.out.println("KnowMart express self-checkout (10 item limit)");
        
        // Ask how many items
        int items;
        do {
                System.out.println("How many items (1-10)?");
                items = keyboard.nextInt();
        } while (items < 1 || items > 10);
        
        // Cost of each item
        double cost;
        double total = 0;
        int k = 0;
        while (k < items)
        {
            System.out.println("Cost of next item?");
            cost = keyboard.nextDouble();
            total = total + cost;
            items = items - 1;
        }
       
        // Extra Bag
        if (items < 4) 
        {
            System.out.println("Do you want a bag (costs .05 extra if you have 3 or less items)?");
            String bag = keyboard.next();
            if (!bag.equals("no"))
            {
                total = total + 0.05;
            }
            
        }
        
        /*if ((items <= 3) && (!bag.equalsIgnoreCase("no")))
        {
            System.out.println("Do you want a bag (costs .05 extra if you have 3 or less items)?");
            String bag = keyboard.next();
            total = total + 0.05;
        }
        */
        total = total * 1.0825;
        System.out.printf("Your total with a 6 percent sales tax is $%1.2f\n", total);
    }
}
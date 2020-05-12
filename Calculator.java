import java.util.*;
/**
 * Write a description of class Calculator here.
 * 
 * Da Wae  
 * 
 */
public class Calculator
{
    public static void main (String[] args)
    {
        //Scanner object so we can get user input
        System.out.println("Welcome to Wade's calculator.");
        Scanner keyboard;
        System.out.println("What is your first number?");
        keyboard = new Scanner(System.in);
        
        //Get a double value from the user
        double number1;
        number1 = keyboard.nextDouble();
        
        //Get another double value from the user
        System.out.println("What is your second number?");
        double number2;
        number2 = keyboard.nextDouble();
        
        //Ask the user what arithmetic operation we are doing (store it as an int)
        System.out.println("What are we doing with these numbers?");
        System.out.println("    1) add");
        System.out.println("    2) subtract");
        System.out.println("    3) multiply");
        System.out.println("    4) divide");
        int option;
        option = keyboard.nextInt();
        
        //Calculate the answer
        double answer;
        
        if (option == 1)
        {
            answer = number1 + number2;
            System.out.println(answer);
        }
        else if (option == 2)
        {
            answer = number1 - number2;
            System.out.println(answer);
        }
        else if (option == 3)
        {
            answer = number1 * number2;
            System.out.println(answer);
        }
        else if (option == 4)
        {
            answer = number1 / number2;
            System.out.println(answer);
        }
        
    }
}


/**
 * Write a description of class MathTrick here.
 * Approximate completion time: 5 minutes
 * @Wade Costa
 * 01/30/2018
 */
public class MathTrick
{
    public static void main(String[] args)
    {
        //Get a positive interger
        int x;
        x = 7;
        
        //Square it
        int y;
        y = x * x;
        
        //Add the original number (to the variable y)
        y = y + x;
        System.out.println(y);
        //Divide by the original number
        y = y / x;
        System.out.println(y);
        //Add 17
        y = y + 17;
        System.out.println(y);
        //Subtract the original number
        y = y - x;
        System.out.println(y); 
        //Divide by
        y = y / 6;
        
        //Print the result
        System.out.println("Here is the final result, which should be 3:");
        System.out.println(y);
        
        
    }
}

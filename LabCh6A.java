
/**
 * Write a description of class PartA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LabCh6A
{
    public static void main(String [] args)
    {
        //************* Prob 1 ***********************
        // Write the isDivisible method below main
        // Test the isDivisible method by running this segment
        
        System.out.println("Is 8 divisible by 3? " + isDivisible(8,3));
        System.out.println("Is 9 divisible by 3? " + isDivisible(9,3));
        
        //************** End Prob 1 ******************/
        //************* Prob 2 ***********************
        // Write the multadd method below main
        // Test the multadd method by running this segment
        
        System.out.println("1*2 + 3 = " + multadd(1.0, 2.0, 3.0));
        
        // Write 2 more test cases
        System.out.println("8*2 + 4 = " + multadd(8.0, 2.0, 4.0));
        System.out.println("12*10 + 6 = " + multadd(12.0, 10.0, 6.0));
        
        
        
        //************** End Prob 2 ******************/
        //************* Prob 3 ***********************
        // Write the isTriangle method below main.
        // HINT: use || or && to chain three logical expressions together.
        // Test the isTriangle method by running this segment.
        // Each test case should print whether the lengths can make a triangle.
        // EXAMPLE: If 4, 1, 2 can be sides of a triangle, it should print 
        // "4,1,2 is a triangle"; otherwise it prints "4,1,2 is NOT a triangle"
        
        if ( isTriangle(4,1,2)){
            System.out.println("4,1,2 is a triangle");
        }
        else{
            System.out.println("4,1,2 is NOT a triangle");
        }
        
        if ( isTriangle(14,10,12)){
            System.out.println("14,10,12 is a triangle");
        }
        else{
            System.out.println("14,10,12 is NOT a triangle");
        }   
        
        // add another three test cases here
        if ( isTriangle(24,3,14)){
            System.out.println("24,3,14 is a triangle");
        }
        else{
            System.out.println("24,3,14 is NOT a triangle");
        }   
        
        if ( isTriangle(2,4,6)){
            System.out.println("2,4,6 is a triangle");
        }
        else{
            System.out.println("2,4,6 is NOT a triangle");
        }   
        
        if ( isTriangle(30,12,29)){
            System.out.println("30,12,29 is a triangle");
        }
        else{
            System.out.println("30,12,29 is NOT a triangle");
        }   
        //************** End Prob 3 ******************/
    } // end of main
    
    // Write the required methods here.
    
    // Part 1
    public static boolean isDivisible(int n, int m)
    {
        if (n%m == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    // Part 2
    public static double multadd(double a, double b, double c)
    {
        return a * b + c;
    }
    
    // Part 3
    public static boolean isTriangle(int a, int b, int c)
    {
        if ((a > b + c) || (b > a + c) || (c > a + b))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

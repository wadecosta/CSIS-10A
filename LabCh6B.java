
/**
 * Write a description of class LabCh6B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LabCh6B
{
    public static void main(String [] args)
    {
        //************* Prob 5 ***********************
        //  Type in the definition of the prod method where indicated
        //  below main and execute it. 
        //  Does it perform the way you predicted? 

        
        System.out.println("prod(1,4) = " + prod(1,4));
        System.out.println("prod(3,8) = " + prod(3,8));
        System.out.println("prod(2,6) = " + prod(2,6));
        System.out.println("prod(4,10) = " + prod(4,10));
        
        //  Try a couple other calls. 
        //  Does it behave as expected? 
        

        //************** End Prob 5 ******************/      
        //************* Prob 6 ***********************
        // (OPTIONAL) We have a triangle made of blocks. The topmost row 
        // has 1 block, the next row down has 2 blocks, 
        // the next row has 3 blocks, and so on. 
        //
        // Define the triangle method below main to compute  
        // recursively the total number of blocks in such a triangle 
        // with the given number of rows. 
        
        // Test cases:
        
        System.out.println("triangle(0) = " + triangle(0));
        System.out.println("triangle(1) = " + triangle(1));
        System.out.println("triangle(2) = " + triangle(2));
        System.out.println("triangle(8) = " + triangle(8));        
        System.out.println("triangle(20) = " + triangle(20));
        System.out.println("triangle(600) = " + triangle(600));
        //************** End Prob 6 ******************/
    }
    
    // type in the prod method here
    // prod is the product of the range of numbers from m to n; Including m and n
    // So (1,4) is (1*2*3*4) = 24
    public static int prod(int m, int n)
    {
        if (m == n)
        {
            return n;
        }
        else
        {
            return n * prod(m, n-1);
        }
        
        /* Stack Diagram
         * 
         * main:
         * prod: m = 1, n = 4, recurse = prod(1,3)
         * prod: m = 1, n = 3, recurse = prod(1,2)
         * prod: m = 1, n = 2, recurse = prod(1,1)
         * prod: m = 1, n = 1, result = 1
         * prod: m = 1, n = 2, result = 2
         * prod: m = 1, n = 3, result = 6
         * prod: m = 2, n = 4, result = 24; returns 24
         */
    }
    
    // (OPTIONAL) define the triangle method here
    public static int triangle(int t)
    {
        if (t == 0)
        {
            return t;
        }
        else
        {
            return t + triangle(t-1);
        }
    }
}
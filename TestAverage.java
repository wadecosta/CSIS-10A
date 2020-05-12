/**
   This program computes test average for three test scores
   Wade Costa
*/

public class TestAverage
{
   public static void main (String [] args)
   {
      System.out.println("\f");  // flush the buffer (erase the screen)
      
      
      // call your method three times here
      average3(78,83,93);
      average3(82,88,70);
      average3(67,78,50);
      
   }  

   // define the method average3 here
   public static void average3 (int a, int b, int c){
       double average;
       average = (double)(a + b + c)/3;
       System.out.println("The three test scores are " + a + ", " + b + ", and " + c);
       System.out.println("The average of the 3 scores is " + average);
       System.out.println("");
       
       
         
   }
}
/**
   This program demonstrates how numeric types and operators behave in Java
*/

public class NumericTypes
{


   public static void main (String [] args)
   {
       
      //******************  Problem 1 *****************************
      //variable declarations
      int number = 2 ;     // number of scores
      int score1 = 100;    // first test score
      int score2 = 95;     // second test score
      double average;            // arithmetic average
      String output;             // line of output to print out
      
      // Find the average of score1 and score2
      average = ((double)score1 + (double)score2) / number;
      
      // Print the average with explanatory info
      System.out.println("The average of " + score1 + " and " + score2 + " is " + average);      
      System.out.println();      // to leave a blank line 
      
      //****************** End Problem 1 ***************************/      
      //******************  Problem 2 *****************************
      
      int fahrenheit = 212;  // boiling temperature in fahrenheit
      int celsius;               // temperature in celsius
     
      // Convert Fahrenheit temperatures to Celsius
      celsius = (int)((double)5/9 * (fahrenheit - 32));
      System.out.println(fahrenheit + " deg F = " + celsius + " deg C");
      System.out.println();      // to leave a blank line

      //****************** End Problem 2 ***************************/     
      //******************  Problem 3 *****************************
      
      double diameter = 2.0; // the diameter of a sphere
      double radius = 0.5 * diameter;
      
      double volume = ((4.0/3.0)* Math.PI * Math.pow(radius,3));
      System.out.println("The diameter of " + diameter + " has a volume of " + volume);
      

      // Create a variable to store the radius and initialize with 
      //    one half of the diameter 
      
      // calculate and store the volume of the sphere using Math.PI and Math.pow
      
      // print out the volume
      
      
      /* Diameter       Volume(by hand)        Volume(by program)
         1                  0.523598776             0.52359877559
         3                  14.13716694             14.1371669411
         8                  268.0825731             268.082573106
       
      
      
      //****************** End Problem 3 *****************************/
      
   }  
}
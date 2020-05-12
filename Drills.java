/**
 * Write a description of class Drills here.
 * 
 * Wade Costa
 * @version (a version number or a date)
 */
public class Drills
{
    public static void main (String [] args){
        System.out.println("\f");  // flush the buffer (erase the screen)
        
        /************* Ex A **************************
        // write a void method, paycheck, below main that calculates and prints
        //  a worker's paycheck, given the number of hours, and pay rate
        
        payCheck( 40, 7.75);
        
        payCheck( 20, 9.25);
        
        payCheck( 50, 12.50);
        
        //************ End Ex A **********************/
        /************* Ex B **************************
        // write a void method volume below main that calculates and prints
        //  the volume of a cylinder, given the radius and height
        
        volume( 0.5, 3);
        
        volume( 2, 2);
        
        volume( 5,1);
        // call area one more time to do the last test in the test plan 
        
        //************ End Ex B **********************/
        /************* Ex C **************************
        // write a void method feetAndInches below main that calculates 
        // and prints the number of feet and inches in a given number of 
        // inches
        
        feetAndInches(40);
        feetAndInches(83);
        feetAndInches(5);
        
        // call your method two more times to finish the test plan
        

        
        //************ End Ex C **********************/
        //************* Ex D **************************
        // write a void method averageSale below main that calculates 
        // and prints the the average sale of a comic book sold at
        // a convention
        
               
        // call your method three times to verify the test plan
        
        averageSale(500,47);
        averageSale(434,13);
        averageSale(122,15);

        
        //************ End Ex D **********************/
        
    }
    // Define method paycheck here
    public static void payCheck (int hours, double rate){
        int pay;
        pay = (int)(hours * rate);
        System.out.println("$" + pay);
        
    }
    
    
    // Define method volume here
    public static void volume (double radius, int height){
        double area;
        area = (double)(height) * Math.pow(radius,2) * Math.PI;
        System.out.println(area);
        
    }
    
    // Define method feetAndInches here
    public static void feetAndInches (int inches){
        int feet;
        int leftover_inches;
        feet = (int)(inches/12);
        leftover_inches = inches - (feet*12);
        System.out.println(inches + " inches is:");
        System.out.println(feet + " feet");
        System.out.println(leftover_inches + " leftover inches");
        System.out.println("");
        
    }
    
    // Define method averageSale here
    public static void averageSale (int total_revenue, int number_sold){
        double average_sale;
        average_sale = (double)(total_revenue)/(double)(number_sold);
        System.out.println(average_sale);
        
    }
    
    

    
}

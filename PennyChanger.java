
/**
 * Write a description of class PennyChanger here.
 * 
 * Wade Costa
 * 2-8-18
 */
public class PennyChanger
{
    public static void main(String [] args){
        int pennies, leftover_pennies,  // the number of each coin we have 
            quarters, dimes, nickels;
        
        pennies = 99;
        System.out.println("We are going to convert " + pennies + " cents into");
        System.out.println("quarters, dimes, nickels, and leftover pennies...\n\n");
        
        // find how many quarters are in pennies
        quarters = pennies/25;  // fix this
        // find how many pennies are leftover after removing the quarters
        leftover_pennies = pennies%25; // fix this

        // find how many dimes are in leftover_pennies
        dimes = leftover_pennies/10; // fix
        // find how many pennies are leftover after removing the dimes
        leftover_pennies = leftover_pennies - (dimes*10);
        // find how many nickels are in leftover_pennies
        nickels = leftover_pennies/5; // fix
        // find how many pennies are leftover after removing the nickels
        leftover_pennies = leftover_pennies - (nickels*5);

        System.out.println("You now have " + quarters + " quarters, " + dimes + " dimes, "); 
        System.out.println(nickels + " nickels, " + leftover_pennies + " pennies. Same amount? ");        
        
    }
}


/**
 * Write a description of class CoinFlip here.
 *
 * Wade Costa
 * 02-8-18
 */
public class CoinFlip
{
    public static void main (String [] args)
    {
        //Get a random number
        //Decide the outcome of a coin flip
        //Get a second random number
        //Decide the outcome of a second coin flip
        //Print out which flip had a higher score
        //Print out the maximum of the two flips
        
        //Get a random number
        double myNumber,myNumber2;
        int score,secondScore;
        myNumber = Math.random();
        myNumber2 = Math.random();
        
        
        //Decide the outcome of a coin flip
        if (myNumber < 0.4)
        {
            System.out.println("heads");
            score = 5;
        }
        else if (myNumber < 0.8)
        {
            System.out.println("tails");
            score = 2;
        }
        else if (myNumber < 0.85)
        {
            System.out.println("landed on the edge!");
            score = 20;
        }
        else 
        {
            System.out.println("fell off the table");
            score = -3;
        }
        System.out.println("Score for the flip was: " + score);
        
        //Decide the outcome of a second coin flip
        if (myNumber2 < 0.4)
        {
            System.out.println("heads");
            secondScore = 5;
        }
        else if (myNumber2 < 0.8)
        {
            System.out.println("tails");
            secondScore = 2;
        }
        else if (myNumber2 < 0.85)
        {
            System.out.println("landed on the edge!");
            secondScore = 20;
        }
        else 
        {
            System.out.println("fell off the table");
            secondScore = -3;
        }
        System.out.println("Score for the flip was: " + secondScore);
        
        //Print out which flip had a higher score
        if (score > secondScore)
        {
            System.out.println("The first flip had the higher score");
        }
        else if (score < secondScore)
        {
            System.out.println("The second flip had the higher score");
        }
        else if (score == secondScore)
        {
            System.out.println("Both flips had the same score");
        }
        
        //Print out the maximum of the two flips
        int maxScore = Math.max(score, secondScore);
        System.out.println("The higher score was: " + maxScore);
        
    }
}

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class PartB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartB
{
    public static void main (String [] args)
                                throws FileNotFoundException
    {
        System.out.println("\f");
        System.out.println("number of words in words.txt file is " + countWords("words.txt"));
        System.out.println("number of words in elementNames.txt file is " + countWords("elementNames.txt"));
        System.out.println("Random word from words.txt file is " + randomWord("words.txt"));
    }
    
    
    public static int countWords(String fileName)
                                throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new File(fileName));
        String word;
        int count = 0;
        while (inFile.hasNext())
        {
            word = inFile.next();
            //System.out.println(word);
            count++;
        }
        inFile.close();
        return count;
    }
    
    public static String randomWord(String fileName)
                                throws FileNotFoundException
    {
        Scanner inFile = new Scanner(new File(fileName));
        int fileSize = countWords(fileName);
        int N = (int)(fileSize*Math.random());
        String word = ("");
        int count = 0;
        while (N >= 0)
        {
            
            if (N == 0)
            {
                return word = inFile.next();
            }
            else
            {
                word = inFile.next();
                N--;
            }
                
            
            
            
        }
        
        inFile.close();
        return word;
    }
}

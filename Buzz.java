
/**
 * Write a description of class Buzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buzz
{
    public static void baffle(String blimp) {
        System.out.println(blimp + blimp); //4
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {
            System.out.println(quince + " zoop"); //6
        } 
        else
        {
            System.out.println("ik"); //2
            baffle(quince); //3
            System.out.println("bwa-ha-ha"); //4 
            zippo(quince, -5); //5
        }
    }

    public static void main(String[] args) {
        zippo("rattle", 13);  //1
    }
}


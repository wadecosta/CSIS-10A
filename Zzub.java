
/**
 * Write a description of class Zzub here.
 *
 * Wade Costa
 * 8-9-18
 */
public class Zzub
{
    public static void nLines(int n) {
    if (n > 0) {
      System.out.println("");
      nLines(n-1);
    }
  }
  
  public static void main(String [] args) {
    System.out.println("Hello");
    nLines(4);
    System.out.println("world");
  }
  
  /*
   * Stack Diagram
   * 
   * nLines1: n = 4
   * nLines2: n = 3
   * nLines3: n = 2
   * nLines4: n = 1
   * nLines5: n = 0
   */
  
}


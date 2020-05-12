class Date {
    // Contributers: Curtis McHenry, Brandon Bullough
    
  public static void main(String[] args) {
    // Declare variables
    String day, month;
    int date, year;
    
    //Assign values
    day = "Thursday";
    month = "August";
    date = 29;
    year = 2013;
    // Print Output
    System.out.print("\f");
    printAmerican(day,date,month,year);
    printEuropean(day,date,month,year);
    
    
    
  }
  
  public static void printAmerican(String day, int date, String month, int year){
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
  }
  
  public static void printEuropean(String day, int date, String month, int year){
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + ", " + year);
  }
  
  
  
  
  /*Part 2 Stack Diagram
   * 
   * main calles printTime(h,m)
   * printTime: h = 11, m = 59
   * printTime: hour = 11, minute = 59
   * printTime: prints 11
   * printTime: prints :
   * printTime: prints 59
   */
  
  /*Part 3 
   * 
   * main calls zoop
   * zoop calls baffle
   * baffle prints wug
   * baffle calls ping 
   * ping prints .
   * goes back to baffle 
   * baffle ends; goes back to zoop
   * zoop prints You wugga 
   * zoop calls baffle
   * baffle prints wug
   * baffle calls ping 
   * ping prints .
   * goes back to baffle
   * baffle ends; goes back to zoop
   * zoop ends; goes back to main
   */
  
}
/**
 * Write a description of class PartA here.
 * 
 * Wade Costa
 * @version (a version number or a date)
 */
public class CodingBatTurnIn
{
   // copy and paste all your codingBat methods here
   // then export jar and turn in like a regular assignment
 public String helloName(String name) {
  return "Hello " + name + "!";
 }
 public String makeAbba(String a, String b) {
  return a + b + b + a;
 }
 public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
 }
 public String extraEnd(String str) {
  String last2 = str.substring(str.length()-2, str.length());
  return last2 + last2 + last2;
 }
 public boolean frontAgain(String str) {
  if (str.length() < 2)
  {
    return false;
  }
  else
  {
    String front = str.substring(0,2);
    String back = str.substring(str.length()-2, str.length());
    if (front.equals(back))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
 }
 public String doubleChar(String str) {
  String char2 = "";
  int i = 0;
  while (i < str.length())
  {
    char a = str.charAt(i);
    char2 = char2 + a + a;
    i++;
  }
  return char2;
 }
 public int countHi(String str) {
  int count = 0;
  for(int i = 0; i < str.length() - 1; i++)
  {
   if(str.substring(i, i+2).equals("hi"))
   {
     count = count + 1;
   }
  }
  return count;
 }
 public boolean xyBalance(String str) {
  int xLoc = -1;
  int yLoc = -1;
  int i = 0;
  while (i < str.length())
  {
    if (str.charAt(i) == 'x')
    {
      xLoc = i;
    }
    if (str.charAt(i) == 'y')
    {
      yLoc = i;
    }
    i++;
  
  }
  if (yLoc >= xLoc)
  {
    return true;
  }
  else
  {
    return false;
  }

 }
 public String repeatEnd(String str, int n) {
  int len = str.length();
  int i = 0;
  String end = "";
  while (i < n)
  {
    end = end + str.substring(len - n, len);
    i++;
  }
  return end;
 }

}

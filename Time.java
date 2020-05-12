
/**
 * Write a description of class Time here.
 *
 * Wade Costa
 * 2018 Jan 27
 */
public class Time
{
    public static void main(String[] args)
    {
        float hour, minute, second, secondSinceMidnight, hourToSecond, minutesToSecond, secondLeftInDay, percentOfDayPassed;
        
        
        
        hour = 23;
        minute = 5;
        second = 26;
        hourToSecond = hour * 3600;
        minutesToSecond = minute * 60;
        secondSinceMidnight = hourToSecond + minutesToSecond + second;
        secondLeftInDay = 86400 - secondSinceMidnight;
        percentOfDayPassed = (secondSinceMidnight/86400)*100;
        System.out.println("Number of seconds since midnight: " + secondSinceMidnight);
        System.out.println("Number of seconds left in day: " + secondLeftInDay);
        System.out.println("Percent of day passed : " + percentOfDayPassed);
         
        
        
        
        
        
        
    }
}

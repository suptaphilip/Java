// BlueJ project: dayOfTheWeek
// Video: Day of the Week
 
public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
       
        // Please do not change the name of this variable
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900
         Day birthday = new Day(1989, 7, 1);
 
        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
        Day desiredDay = birthday;
        Day referenceDay = new Day(1900,1,1);
        
        int referenceWeekDay = 1;
        int daysBetween = desiredDay.daysFrom(referenceDay);
        int uncorrectedWeekDay = referenceWeekDay + daysBetween;
        int weekday = uncorrectedWeekDay % 7;
 
        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
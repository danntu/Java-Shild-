/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

/**
 *
 * @author DMyrzaka
 */
import java.util.*;
public class GregorianCalendarDemo {
    public static void main(String args[]){
        String month[]={
            "Jan","Feb","Mar","Apr",
            "May","Jun","Jul","Aug",
            "Sep","Oct","Nov","Dec"
        };
        int year;
         GregorianCalendar gcalendar = new GregorianCalendar();
         System.out.print("Date: ");
         System.out.print(month[gcalendar.get(Calendar.MONTH)]);
         System.out.print(" "+gcalendar.get(Calendar.DATE)+" ");
         System.out.println(year=gcalendar.get(Calendar.YEAR));
         System.out.print("Time: ");
         System.out.print(gcalendar.get(Calendar.HOUR)+":");
         System.out.print(gcalendar.get(Calendar.MINUTE)+":");
         System.out.println(gcalendar.get(Calendar.SECOND));
         
         if (gcalendar.isLeapYear(year)){
             System.out.println("Текущий год вискосный");                     
         }
         else{
             System.out.println("Текущий год не високосный");
         }
         System.out.println("Е"+1+2+"T");
    }
}

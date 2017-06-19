/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

/**
 *
 * @author DMyrzaka
 */
import java.util.Calendar;
public class CalendarDemo {
    public static void main(String args[]){
        String month[]={
            "Jan","Feb","Mar","Apr",
            "May","Jun","Jul","Aug",
            "Sep","Oct","Nov","Dec"
        };
         Calendar calendar = Calendar.getInstance();
         System.out.print("Date: ");
         System.out.print(month[calendar.get(Calendar.MONTH)]);
         System.out.print(" "+calendar.get(Calendar.DATE)+" ");
         System.out.println(calendar.get(Calendar.YEAR));
         System.out.print("Time: ");
         System.out.print(calendar.get(Calendar.HOUR)+":");
         System.out.print(calendar.get(Calendar.MINUTE)+":");
         System.out.println(calendar.get(Calendar.SECOND));
         
         calendar.set(Calendar.HOUR, 10);
         calendar.set(Calendar.MINUTE, 29);
         calendar.set(Calendar.SECOND, 22);
         System.out.print("Changed time: ");
         System.out.print(calendar.get(Calendar.HOUR)+":");
         System.out.print(calendar.get(Calendar.MINUTE)+":");
         System.out.println(calendar.get(Calendar.SECOND));
         
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

/**
 *
 * @author DMyrzaka
 */
import java.util.Formatter;
public class PrecisionDemo {
    public static void main(String args[]){
       Formatter fmt = new Formatter();
       
       fmt.format("%.4f", 123.1234567);
       System.out.println(fmt);
       fmt.close();
       
       fmt = new Formatter();
       fmt.format("%16.2e", 123.1234567);
       System.out.println(fmt);
       fmt.close();
       
       fmt = new Formatter();
       fmt.format("%.15s", "Форматировать в Java теперь очень просто.");
       System.out.println(fmt);
       fmt.close();
       
    }
}

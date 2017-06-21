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
public class LeftJustify {
    public static void main(String args[]){
        Formatter fmt = new Formatter();
        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("%+d", 100);
        System.out.println(fmt);
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("% d", -100);
        System.out.println(fmt);
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("% d", 100);
        System.out.println(fmt);
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("% d", -200);
        System.out.println(fmt);
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("% d", 200);
        System.out.println(fmt);
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("%(d", -200);
        System.out.println(fmt);
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("%,.2f", 4356783497.34);
        System.out.println(fmt);
        fmt.close();
        
        fmt = new Formatter();
        fmt.format("%d в шестнадцатеричном формате равно %1$X", 255);
        System.out.println(fmt);
        fmt.close();
    }
}

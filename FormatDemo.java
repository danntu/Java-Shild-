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
public class FormatDemo {
    public static void main(String args[]){
        try (Formatter fmt = new Formatter()){
            fmt.format("Formatting %s simple %d %f","is",10,98.6);
        System.out.println(fmt);
        }
        
       
    }
}

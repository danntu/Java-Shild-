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
public class CurDemo {
    public static void main(String args[]){
        Currency c = Currency.getInstance(Locale.US);
        System.out.println("Symbol: "+c.getSymbol());
        System.out.println("Количество дробных разрядов по умолчанию: "+c.getDefaultFractionDigits());
    }
}

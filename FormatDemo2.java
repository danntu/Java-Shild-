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
public class FormatDemo2 {
    public static void main(String args[]){
        Formatter fmt = new Formatter();
        for (double i=1000;i<1.0e+10;i*=100){
            fmt.format("%g", i);
            System.out.println(fmt);
        }
        fmt.format("%nШестнадцадтеричное: %x, восьмеричное: %o", 196,196);
        System.out.println(""+fmt);
        fmt.close();
    }
}

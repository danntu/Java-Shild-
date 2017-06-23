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
public class LRBDemo {
    public static void main(String args[]){
        ResourceBundle rd = ResourceBundle.getBundle("SampleRB_de",Locale.GERMAN);
        System.out.println("English version: ");
        System.out.println("String for key Title: "+rd.getString("title"));
        System.out.println("String for key StopText: "+rd.getString("StopText"));
        System.out.println("String for key StartText: "+rd.getString("StartText"));
        System.out.println();
    }
}

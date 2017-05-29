/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

import java.util.TreeSet;

/**
 *
 * @author DMyrzaka
 */
public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("X");
        ts.add("A");
        ts.add("Z");
        ts.add("E");
        ts.add("C");
        ts.add("F");
        System.out.println(ts);
        System.out.println(ts.subSet("A", "X"));
    }
}

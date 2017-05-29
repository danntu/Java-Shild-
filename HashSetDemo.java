/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

import java.util.HashSet;

/**
 *
 * @author DMyrzaka
 */
public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("X");
        hs.add("A");
        hs.add("Z");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);
    }
}

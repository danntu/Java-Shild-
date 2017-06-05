/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

/**
 *
 * @author DMyrzaka
 */
import java.util.*;
public class NewStyle {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<String>();
        list.add("one");  list.add("two"); list.add("three"); list.add("four");
        
        Iterator<String> itr = list.iterator();
         while(itr.hasNext()){
             String str=itr.next();
             System.out.println(str+" имеет длину "+str+" символов.");
         }
    }
}

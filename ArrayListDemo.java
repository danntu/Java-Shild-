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
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        
        System.out.println("Initial size al: "+al.size());
        al.add("C");
        al.add("A");
        al.trimToSize();
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("D");
        al.add(1, "A2");
        ArrayList<String> test = new ArrayList<>(al);
        System.out.println("Initial size test: "+test.size());
        System.out.println("Method get : "+al.get(2));
        System.out.println("al size after insert: "+al.size());
        System.out.println("al vlues:" +al);
        
        al.remove(2);
        al.remove("D");
        al.remove("D");
        System.out.println("al vlues:" +al);
        
       String str[] = new String[al.size()];
       str=al.toArray(str);
       for (String s : str) 
            System.out.print(s+" ");
    }
}

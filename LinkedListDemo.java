/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

/**
 *
 * @author DMyrzaka
 */
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        //System.out.println("Initial values ll: "+ll);
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Initial values ll: "+ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println("ll values after remove: "+ll);
        
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll values after first and last: "+ll);
        
        ll.set(2, ll.get(2) +" Changed");
        System.out.println("ll after change: "+ll);
    }
}

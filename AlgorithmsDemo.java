/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;

/**
 *
 * @author DMyrzaka
 */
public class AlgorithmsDemo {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8); ll.add(20); ll.add(-20); ll.add(8);
        
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);
        
        System.out.print("Список отсортирован в обратном порядке: ");
        
        for (int i : ll)
            System.out.print(i+" ");
        
        System.out.println();
        
        Collections.shuffle(ll);
        
        System.out.print("Список перемешан: ");
        
        for (int i : ll)
            System.out.print(i+" ");
        
        System.out.println();
        System.out.println("Minimum: "+Collections.min(ll));
        System.out.println("Maximum: "+Collections.max(ll));
    }
}

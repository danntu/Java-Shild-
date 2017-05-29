/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author DMyrzaka
 */
public class IteratorDemo {
    public static void main(String[]  args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("C"); al.add("A"); al.add("E"); al.add("B"); al.add("D"); al.add("F");
        
        
        System.out.println("Исходное содержимое al: ");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        
        ListIterator<String> litr =al.listIterator();
        while(litr.hasNext()){
            litr.set(litr.next()+"+");
        }
        
        System.out.println("Модифицированное содержимое al: ");
        itr=al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        
        System.out.println("Модифицированное список в обратном порядке: ");
        
        while(litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }
        System.out.println();
        
    }
}

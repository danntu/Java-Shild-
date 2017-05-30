/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

import java.util.ArrayDeque;

/**
 *
 * @author DMyrzaka
 */
public class ArrayDequeDemo {
    public static void main(String[] args){
        ArrayDeque<String> adq = new ArrayDeque<String>();
        adq.push("A");
        adq.push("B");
        adq.push("C");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.println("Выталкиваем из стека:");
        while(adq.peek() !=null)
            System.out.print(adq.pop()+" ");
    }
}

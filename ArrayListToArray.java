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

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1); al.add(2); al.add(3); al.add(4);
         System.out.println("al values: "+al);
         Integer[] ia = new Integer[al.size()];
         ia=al.toArray(ia);
         int sum=0;
         for (int i : ia) sum+=i;
         
         System.out.println("Сумма: "+sum);
    }
}

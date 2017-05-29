/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

import java.util.ArrayList;

/**
 *
 * @author DMyrzaka
 */
public class ForEachDemoList {
   public static void main(String args[]){
       ArrayList<Integer> vals = new ArrayList<Integer>();
       vals.add(1); vals.add(2); vals.add(3); vals.add(4); vals.add(5);
       
       System.out.print("Исходное значение vals: ");
       for(int v : vals)
           System.out.print(v+" ");
       System.out.println();
       
       int sum=0;
       
       for(int v : vals)
           sum+=v;
       
       System.out.println("Сумма значений: "+sum);
   } 
}

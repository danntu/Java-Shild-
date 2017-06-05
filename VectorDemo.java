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

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v  = new Vector<>(3,2);
        System.out.println("Initial size = "+v.size());
        System.out.println("Initial capacity = "+v.capacity());
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Емкость после четырех добвление "+v.capacity());
        v.addElement(5);
        System.out.println("Текущая емкость "+v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println("Текущая емкость "+v.capacity());
        v.addElement(9);
        v.addElement(10);
        System.out.println("Текущая емкость "+v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("Первый элемент: "+v.firstElement());
        System.out.println("Последний элемент: "+v.lastElement());
        if (v.contains(3))
            System.out.println("Вектор содержит 3");
        Enumeration<Integer> vEnum = v.elements();
        System.out.println("Элементы вектора:");
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement()+" ");
            System.out.println();
                    
        
    }
}

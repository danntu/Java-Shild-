/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glava12;

/**
 *
 * @author DMyrzaka
 */
public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap1,ap2,ap3;
        
        System.out.println("All enum constants");
        for (Apple a : Apple.values()) System.out.println(a+" "+a.ordinal());
        ap1=Apple.RedDel; ap2=Apple.GoldenDel; ap3=Apple.RedDel;
        
        System.out.println();
        
        if (ap1.compareTo(ap2)<0) System.out.println(ap1+" идет вперед "+ap2);
        if (ap1.compareTo(ap2)>0) System.out.println(ap2+" идет вперед "+ap1);
        if (ap1.compareTo(ap3)==0) System.out.println(ap1+" эквивалентно "+ap3);
        
        System.out.println();
        
        if(ap1.equals(ap2)) System.out.println("Error!");
        if(ap1.equals(ap3)) System.out.println(ap1+" equals "+ap3);
        
        if (ap1==ap3) System.out.println(ap1+" == "+ap3);
    }
}

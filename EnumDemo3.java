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
public class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;
        System.out.println("Winesap consist "+Apple1.Winesap.getPrice()+" cent");
        System.out.println("All apple price:");
        for (Apple1 a : Apple1.values()) System.out.println(a +" is cost "+a.getPrice()+" cent");
    }
}

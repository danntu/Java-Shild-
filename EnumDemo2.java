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
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Apple constants:");
        Apple allapples[] = Apple.values();
        for(Apple a : allapples) System.out.println(a); 
        System.out.println();
        String name="RedDel";
        try{
        ap=Apple.valueOf(name);
            System.out.println("ap содержит "+ap);
        } catch (IllegalArgumentException e){
            System.out.println("Нету такой константы "+name);
        }
                
        
    }
}

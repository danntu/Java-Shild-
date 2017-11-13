/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class Exc2 {
    public static void main(String args[]){
        int d,a; 
        try{
        d = 0;
        a=42/d;
        System.out.println("Это не будет выведено.");    
        } catch(ArithmeticException e){
            //e.printStackTrace();
            System.out.println("Деление на нуль запрещено");
        }
        System.out.println("После оператора catch");
    }
}

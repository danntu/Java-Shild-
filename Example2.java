/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class Example2 {
   public static void main(String []args) {
       int num=100;
       System.out.println("Вывод переменной "+num);
       num*=2;
       System.out.println("Вывод переменной удвоенной " + num);
       
       if (num<100) System.out.println("num меньше 100 "+ (num<100));
       else if (num<300) System.out.println("num меньше 300 "+ (num<300));
       else System.out.println("num>100 ответ "+ (num>100));
       
   }
         
          
   
}

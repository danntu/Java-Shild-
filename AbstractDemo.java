/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstract;

/**
 *
 * @author DMyrzaka
 */
abstract class A{
    abstract void callme();
    
    void callmetoo(){
        System.out.println("Это конкретный метод.");
    }
}
class B extends A{
   void callme(){
        System.out.println("Реализация метода callme класса В.");
    }
}
        
public class AbstractDemo {
    public static void main(String args[]){
       B b = new B();
       b.callme();
       b.callmetoo();
    }
}

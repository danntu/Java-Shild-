/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
class A1{
    A1(){
        System.out.println("Внутри конструктора А1.");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("Внутри конструктора B1.");
    }
}
class C1 extends B1{
    C1(){
        System.out.println("Внутри конструктора C1.");
    }
}
public class CallingCons {
    public static void main(String args[]){
        C1 c = new C1();
    }
}

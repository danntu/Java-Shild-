/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dispatch;

/**
 *
 * @author DMyrzaka
 */

class A{
    void callme(){
        System.out.println("Внутри метода callme класса А");
    }
}

class B extends A{
@Override
    void callme(){
        System.out.println("Внутри метода callme класса B");
    }
}
class C extends B{
@Override
    void callme(){
        System.out.println("Внутри метода callme класса C");
    }
}

        
public class Dispatch {
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        
        A r;
        r=a;
        r.callme();
        
        r=b;
        r.callme();
        
        r=c;
        r.callme();
        
    }
}

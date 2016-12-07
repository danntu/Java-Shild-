/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
interface A1{
    void meth1();
    void meth2();
}
interface B1 extends A1{
    void meth3();
}

class MyClass implements B1{
    public void meth1(){
        System.out.println("meth1()");
    }
    public void meth2(){
        System.out.println("meth2()");       
    }
    public void meth3(){
        System.out.println("meth3()");
    }
}

public class IFExtend {
    public static void main(String args[]){
        MyClass ob = new MyClass();
        
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}

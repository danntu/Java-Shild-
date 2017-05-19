/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glava14;

/**
 *
 * @author DMyrzaka
 */
class TwoGen<T, V>{
    T ob1; V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    
    void showTypes(){
        System.out.println("Type T: "+ob1.getClass().getName());
        System.out.println("Type V: "+ob2.getClass().getName());
    }
    T getOb1()
    {
        return  ob1;
    }
    
    V getOb2(){
        return ob2;
    }

} 
public class SimpleGen {
    public static void main(String[] args) {
        TwoGen<Integer,String> tg = new TwoGen<Integer,String>(200,"Generic");
        tg.showTypes();
        System.out.println("Value: "+tg.ob1.intValue());
        System.out.println("Value: "+tg.getOb2().toString());
    }
}

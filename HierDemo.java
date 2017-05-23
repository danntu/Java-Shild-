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
class Gen1<T>{
    T ob;

    public Gen1(T ob) {
        this.ob = ob;
    }
    
    T getob(){
        return ob;
    }
}
class Gen2<T,V> extends Gen1<T>{
    V ob2;

    public Gen2( T o, V ob2) {
        super(o);
        this.ob2 = ob2;
    }
    V getob2(){
        return  ob2;
    }
}
public class HierDemo {
    public static void main(String[] args) {
        Gen2<String, Integer> x = new Gen2<String, Integer>("Значение равно: ",99);
        System.out.print(x.getob());
        System.out.println(x.getob2());
    }
}

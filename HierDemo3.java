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
class Gen4<T>{
    T ob;

    public Gen4(T ob) {
        this.ob = ob;
    }
    T getob(){
        return ob;
    }
}
class Gen5<T> extends Gen4<T>{

    public Gen5(T o) {
        super(o);
    }
   
}
public class HierDemo3 {
    public static void main(String[] args) {
        Gen4<Integer> iOb = new Gen4<Integer>(88);
        Gen5<Integer> iOb2 = new Gen5<Integer>(99);
        Gen5<String> strOb2= new Gen5<String>("Обобщенный тест");
        
        if (iOb2 instanceof Gen5<?>)
            System.out.println("iOb2 является экземпляром Gen5");
        
        if (iOb2 instanceof Gen4<?>)
            System.out.println("iOb2 является экземпляром Gen4");
        System.out.println();
        
        if (strOb2 instanceof Gen5<?>)
            System.out.println("strOb2 является экземпляром Gen5");
        if (strOb2 instanceof Gen4<?>)
            System.out.println("strOb2 является экземпляром Gen4");
        System.out.println("");
        
        if (iOb instanceof Gen5<?>)
            System.out.println("iOb является экземпляром Gen5");
        
        if (iOb instanceof Gen4<?>)
            System.out.println("iOb является экземпляром Gen4");
    }
}

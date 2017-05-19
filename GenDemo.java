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
class Gen<T>{
    T ob ;
    
    Gen(T o){
        ob=o;
    }
    
    T getOb(){
        return ob;
    }
    
    void showType(){
        System.out.println("Типом Т является "+ob.getClass().getName());
    }
}
public class GenDemo {
    public static void main(String[] args) {
        Gen <Integer> iOb = new  Gen<Integer>(88);
        iOb.showType();
        int v =iOb.getOb();
        System.out.println("value: "+v);
        System.out.println();
        
        Gen <String> strOb = new Gen<String>("Generic test");
        strOb.showType();
        String str= strOb.getOb();
        System.out.println("Value:" +str);
    }
}

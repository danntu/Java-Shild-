/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
class A{
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}
class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x<0 ? false : true;
    }
}
public class NestedIFDemo {
    public static void main(String args[]){
        A.NestedIF nif = new B();
        
        if (nif.isNotNegative(10)) System.out.println("10 не является отрицательным");
        if(nif.isNotNegative(-12)) System.out.println("Это не будет отображаться");
    }
}

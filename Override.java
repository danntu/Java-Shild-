/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

/**
 *
 * @author DMyrzaka
 */
class A{
    int i,j;
    A(int a, int b){
        i=a; j=b;
    }
    
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k=c;
    }
    
    void show(){
        System.out.println("k: "+k);
    }
}
public class Override {
    public static void main(String args[]){
        B subOb = new B(1,2,3);
        subOb.show();
    }
}

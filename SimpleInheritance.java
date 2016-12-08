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
int i,j;


    void showij(){
        System.out.println("i and j "+i+" "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: "+k);
    }
    void sum(){
        System.out.println("i+j+k:"+(i+j+k));
    }
}
class SimpleInheritance {
    public static void main (String args[]){
       A superOb=new A();//объект и ссылка на класс
       B subOb=new B();
        //SimpleInheritance sss=new SimpleInheritance sss=();
        //System.out.println(" "+new A().j);
        //superOb.showij();
        superOb.i=10;
        superOb.j=10;
        System.out.println("Содержимое suoerOb: ");
        superOb.showij();
        System.out.println();
        
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        
        superOb.showij();//не удалять!
        
        subOb.showij();
        System.out.println("Содержимое subOb: ");
        subOb.showij();
        subOb.showk();
        
        System.out.println();
        System.out.println("Сумма i, j и k в subOb:");
        subOb.sum();
                
    }
}
        


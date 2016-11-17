/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package glava7;

/**
 *
 * @author DMyrzaka
 */

class Test
{
    int a, b;
    Test (int i,int j){
        a=i;
        b=j;
    }
    boolean equals(Test obj) {
        if (obj.a==a && obj.b==b) return true;
        else return false;
    
}
}


public class PassOb {
    public static void main (String args []) {
Test ob1=new Test(100,22);
Test ob2=new Test(100,22);
Test ob3=new Test(-5,22);


        System.out.println("ob1==ob2 " + ob1.equals(ob2));
        System.out.println("ob2==ob3 " + ob2.equals(ob3));

        
    }
            
    
}

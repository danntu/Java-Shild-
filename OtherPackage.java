/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p2;

/**
 *
 * @author DMyrzaka
 */
class OtherPackage {

   OtherPackage() {
   p1.Protection p = new p1.Protection();
       System.out.println("конструктор другого пакета");
       System.out.println("n_pub = " + p.n_pub);  
   
   }
   
    
}

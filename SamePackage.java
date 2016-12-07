/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

/**
 *
 * @author DMyrzaka
 */
class SamePackage {

    SamePackage() {
        Protection p = new Protection();
        System.out.println("конструктор этого же пакета");
        System.out.println("n = " + p.n);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
    
}

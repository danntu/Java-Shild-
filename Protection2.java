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
 class Protection2 extends p1.Protection{

    Protection2() {
        System.out.println("унаследованный конструктор другого пакета");
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
    
}

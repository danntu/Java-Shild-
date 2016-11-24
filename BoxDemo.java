/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class BoxDemo {
    public static void main(String args[]){
        Box mybox = new Box();
        mybox.w=10;
        mybox.h=20;
        mybox.d=15;
       System.out.println("Объем равен "+mybox.w*mybox.h*mybox.d);
        
    }
}

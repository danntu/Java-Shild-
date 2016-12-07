/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
interface Callback{
    void callback(int param);
}
public class Client implements Callback {
    public void callback(int p){
        System.out.println("Метод callback, вызванный со значением "+p);
    }
    
    void nonIfaceMeth(){
        System.out.println("Test");
    }
    
 
    
}

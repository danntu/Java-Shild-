/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Еще одна версия callback");
        System.out.println("p в квадрате равно " + (p*p));
    }
}

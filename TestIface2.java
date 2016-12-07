/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class TestIface2 {
    public static void main(String args[]){
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(10);
        c=ob;
        c.callback(10);
    }
}

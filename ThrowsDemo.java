/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException
    {
        System.out.println("Внутри throwOne");
        throw new IllegalAccessException("demo illegalexception");
    }
    
    public static void main(String[] args) {
        try{
            throwOne();
        }
        catch(IllegalAccessException e){
            System.out.println("Перехвачено "+e);
        }
    }
}

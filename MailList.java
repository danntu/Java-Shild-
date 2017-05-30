/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

import java.util.LinkedList;

/**
 *
 * @author DMyrzaka
 */
class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }
    
    public String toString(){
        return name+"\n"+street+"\n"+city+" "+state+" "+code;
    }
} 
public class MailList {
    public static void main(String args[]){
        LinkedList<Address> ml = new LinkedList<Address>(); 
        
        ml.add(new Address("Myrzakanov D.U.","Asyl Arman 167","Almaty","AL","480500"));
        
        for (Address element : ml)
            System.out.println(element+"\n");
    }
}

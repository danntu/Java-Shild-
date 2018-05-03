package javatpoint.access.mypack;

import javatpoint.access.pack.*;


public class B {
    public static void main(String[] args) {
        A obj = new A(); //compile time error
        obj.msg(); //compile time error
    }
}

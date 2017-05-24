/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glava15;

/**
 *
 * @author DMyrzaka
 */
public class MakeString {
    public static void main(String[] args) {
        char[] c ={'J','a','v','a' };
        String s1 =new String(c);
        String s2 = new String(s1);
        System.out.println(s1+" length "+s1.length());
        System.out.println(s2+" length "+s2.length());
        
        byte[] ascii ={65,66,67,68,69,70};
        String s3 = new String(ascii);
        String s4  = new String(ascii, 2, 3);
        System.out.println(s3+" length "+s3.length());
        System.out.println(s4+" length "+s4.length());
        System.out.println("abc.length() ="+"abc".length());
        String age="9";
        String s5= "Ему "+age+" лет.";
        System.out.println("s5 = "+s5);
        String longStr= "Это может быть "
                + "очень длтнная строка, которую следует "
                + "перенести.  Но конкатенация позволяет "
                + "предотвратить это.";
        System.out.println(longStr);
        int age1=9;
        String s6= "Ему "+age1+" лет.";
        System.out.println("s6 = "+s6);
        String s7="four: "+2+2;
        System.out.println("s7 = "+s7);
        String s8 = "four: "+(2+2);
        System.out.println("s8 = "+s8);
    }
}

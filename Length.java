/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package glava7;

import java.util.Locale;

/**
 *
 * @author DMyrzaka
 */

public class Length {
    public static void main(String args[]){
    String s1="Hello ";
    String s2="world";
    String s3="";
    String s4="Hello ";
    
    System.out.println("s1.charAt(0) = "+s1.charAt(0));
    System.out.println("s1.codePointAt(0) = "+s1.codePointAt(0));
    System.out.println("s1.codePointBefore(1) = "+s1.codePointBefore(1));
    System.out.println("s1.codePointCount(0, 2) = "+s1.codePointCount(0, 2));
    System.out.println("s1.compareTo(s3) = "+s1.compareTo(s3));
    System.out.println("s1.compareToIgnoreCase(s3) = "+s1.compareToIgnoreCase(s3));
    System.out.println("s1.contains(s4) = "+s1.contains(s3));
    System.out.println("s1.concat(s2) = "+ s1.concat(s2));
    System.out.println("s1 + s2 = "+ s1+s2);
    System.out.println("s1.contains(\"H\") = "+s1.contains("H"));
    System.out.println("s3.isEmpty() = "+s3.isEmpty());    
    
    System.out.println("s1.replace(\"H\",\"h\" ) = "+s1.replace("H","h" ));
    System.out.println("s1 = "+s1);
    final int a=5;
    
    
    
        System.out.println("a="+a*3);
        
    
      
      
    }
}

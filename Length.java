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
        
        char  val[]= {'B','e','l','l','o'};
        int   unicode[]= {97,98,99,100};
        char val1[] = new char[10];
        val1[0]='H';
        val1[1]='e';
        
        byte mas[] ={97};
        System.out.println("a[] = "+mas[0]);
   
    
    String s5 = new String();
    String ghgf=new String("Hello");
    String s1= new String(val,1,3);
    String unicod = new String (unicode,1,2);
        System.out.println("unicod "+unicod);
    
     
    //s1=null;
    
    
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
   
    //s1=s1.replace("H","j" );
    
    
    
       // System.out.println(" dfd \" fgf ");
    
    
    System.out.println("s1 = "+s1);
    
    final int a=5;
    //a=a*5;
    System.out.println("a="+a*3);
        
    
      
      
    }
}

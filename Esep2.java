/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package glava7;

import java.util.Random;

/**
 *
 * @author DMyrzaka
 */


public class Esep2 {

public static int square(int a){
   return a*a;
}
public static void main(String args[]){
    Random r = new Random();
    // birinshi san
    int a = r.nextInt(100)-50;
    System.out.println("Биринши кездейсок сан "+a);
    if (a>0) System.out.println("Биринши кездейсок саннын квадраты "+square(a));
    // ekinshi san
    int b = r.nextInt(100)-50;
    System.out.println("Екинши кездейсок сан "+b);
    if (b>0) System.out.println("Екинши кездейсок саннын квадраты "+square(b));
    
    int c = r.nextInt(100)-50;
    System.out.println("Ушинши кездейсок сан "+c);
    if (c>0) System.out.println("Ушинши кездейсок саннын квадраты "+square(c));
    
    int d = r.nextInt(100)-50;
    System.out.println("Тортинши кездейсок сан "+d);
    if (d>0) System.out.println("Тортинши кездейсок саннын квадраты "+square(d));


}    
}

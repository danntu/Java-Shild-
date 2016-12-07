
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */


public class Massive {
    
static int minim(int x[]){
    int min=x[0];
    for (int i=1;i<x.length;i++)
    {
        if (i % 2 ==1){
            if (x[i]<min) min=x[i];
        }
    }
return min; 
}
    
public static void main(String args[]){
    int a[] = new int[15];
    int b[] = new int[15];
    int c[] = new int[15];
    int d[] = new int[15];
    
    for (int i=0;i<a.length;i++) a[i]= new Random().nextInt(100);
    for (int i=0;i<b.length;i++) b[i]= new Random().nextInt(100);
    for (int i=0;i<c.length;i++) c[i]= new Random().nextInt(100);
    for (int i=0;i<d.length;i++) d[i]= new Random().nextInt(100);
    
    System.out.println("Random massive ");
    System.out.println("Massive A");
    for (int i=0;i<a.length;i++) System.out.print(a[i]+" ");
    System.out.println();
    
    System.out.println("Massive B");
    for (int i=0;i<b.length;i++) System.out.print(b[i]+" ");
    System.out.println();
    
    System.out.println("Massive C");
    for (int i=0;i<c.length;i++) System.out.print(c[i]+" ");
    System.out.println();
    
    System.out.println("Massive D");
    for (int i=0;i<d.length;i++) System.out.print(d[i]+" ");
    System.out.println();
    
    System.out.println("Minimum A "+minim(a));
    System.out.println("Minimum B "+minim(b));
    System.out.println("Minimum C "+minim(c));
    System.out.println("Minimum D "+minim(d));
    
    System.out.println("A+B+C+D minimum "+(minim(a)+minim(b)+minim(c)+minim(d)));
    
    }    
}

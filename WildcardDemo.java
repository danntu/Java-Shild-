/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glava14;

/**
 *
 * @author DMyrzaka
 */

public class WildcardDemo {
    public static void main(String[] args) {
                Integer inums[] = {1,2,3,4,5,7};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v=iob.average();
        System.out.println("Average value iob ="+v);
        
        Double dnums[]={1.1,2.2,4.3,6.6};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Average value dob ="+w);
        
        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F,5.0F, 7.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double x=fob.average();
        System.out.println("Average value fob ="+x);
        
        System.out.print("Average iob and dob ");
        if(iob.sameAvg(dob))
            System.out.println(" equal");
        else 
            System.out.println(" not equal");
    
        System.out.print("Average iob and fob");
        if(iob.sameAvg(fob))
               System.out.println(" equal");
        else
            System.out.println(" not equal");

    }
}

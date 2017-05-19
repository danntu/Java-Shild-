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
class Stats<T extends  Number>{
    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }
    
    double average(){
        double sum=0.0;
        
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i].doubleValue();
        }
     return sum/nums.length;          
    }
}
public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5,7};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v=iob.average();
        System.out.println("Average value iob ="+v);
        
        Double dnums[]={1.1,2.2,4.3,6.6};
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("Average value dob ="+w);
    }
}

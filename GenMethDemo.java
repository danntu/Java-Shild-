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
public class GenMethDemo {
    static <T,V extends T> boolean isIn(T x, V[] y){
        for (int i=0;i<y.length;i++)
            if(x.equals(y[i])) return true;
            return  false;
    }
    public static void main(String[] args) {
        Integer nums[] ={1,2,3,4,5};
        if(isIn(2, nums))
            System.out.println("2 is consist in nums");
        
        if(!isIn(7, nums))
            System.err.println("7 is  not consist in nums");
        System.out.println();
        
        String strs[] = {"one","two","three","four","five"};
        if (isIn("two", strs))
            System.out.println("two is consist in strs");
        if(!isIn("seven", strs)) 
            System.out.println("seven is not consist in strs");
    }
}

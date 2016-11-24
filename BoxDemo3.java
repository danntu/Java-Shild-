/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class BoxDemo3 {
    public static void main (String args[]){
        Box box3=new Box(3,3,3);
        
        Box box2= new Box(2,2,2);
         
    
         
            
         
        
        box3.SetDim(5, 6, 3);
         box2.SetDim(9, 10, 3);
         //box3.volume();
         System.out.println(box3.volume());
         System.out.println(box2.volume());
         
    }
    
}

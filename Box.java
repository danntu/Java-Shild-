/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class Box {
    double w;
    double h;
    double d;
    
    Box() {
        System.out.println("Constructor Box");
        w=h=d=10;
       
    }
    
    Box(double w, double h, double d)
    {
        w=w;
        h=h;
        d=d;
        
    }
    
    Box(double w, double h)
    {
        w=w;
        h=h;
             
    }
    
    Box(double w)
    {
        w=w;
        
        
    }
    
    
    
    
    double volume (){
      
       //double s;
        //System.out.println(width*height*depth);
         return this.w*this.h*this.d;
    }
    
    double volume1() {
        w=5;
        h=2;
        d=2;
        
        return volume();
    }
    
    void SetDim(double w, double h, double d)
    {
        this.w=w;
        this.h=h;
        this.d=d;
        
    }
    
    
    
    
    
}


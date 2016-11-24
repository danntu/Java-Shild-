/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package glava7;

/**
 *
 * @author DMyrzaka
 */
class Box1{
    double w,h,d;
    Box1 (double w,double h, double d){
        this.w=w;
        this.h=h;
        this.d=d;
    }
    
}
class Box{
    double w, h, d;
    Box (Box1 obj){
        w=obj.w;
        h=obj.h;
        d=obj.d;
    } 
    Box(double a, double b, double c){
        w=a; h=b; d=c;
    }
    Box (){
        w=h=d=-1;
    }
    Box (double aaa){
        w=h=aaa; d=aaa+1;
    }
    double volume(){
        return w*h*d;
    }
}
public class Overload2 {
    public static void main(String args[]){
        Box mybox1=new Box(10,20,15);
        Box mybox2=new Box();
        Box mybox3=new Box(7);
        
        Box1 myclone1=new Box1(1,2,3);
        Box myclone=new Box (myclone1);
        
        System.out.println(myclone.volume());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
     width=ob.width;
     height=ob.height;
     depth=ob.depth;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    Box(){
        width=height=depth=-1;
    }
    Box(double len){
        width=height=depth=len;
    }
    
    double volum(){
        return width*height*depth;            
    }      
}

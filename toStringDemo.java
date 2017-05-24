/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glava15;

/**
 *
 * @author DMyrzaka
 */
class Box{
    double width; double height; double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public String toString(){
        return "Size "+width+" on "+depth+" on "+height+".";
    }
}
public class toStringDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Box b: "+b;
        System.out.println(b);
        System.out.println(s);
    }
}

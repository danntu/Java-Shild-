/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstract;

/**
 *
 * @author DMyrzaka
 */
abstract class Figure{
    double dim1,dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    abstract  double area();
}
class Rectangle extends Figure{
    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    @Override
    double area(){
        System.out.println("В области четырехугольника");
        return  dim1*dim2;
    }
}
class Triangle extends Figure{

    public Triangle(double dim1,double dim2) {
        super(dim1, dim2);
    }
    
    @Override
    double area(){
        System.out.println("В области треугольника.");
        return dim1*dim2/2;
    }
}
public class AbstractAreas {
    public static void main(String args[]){
        //Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        
        Figure figref;
        
        figref=r;
        System.out.println("Площадь равна "+figref.area());
        
        figref=t;
        System.out.println("Площадь равна "+figref.area());
        
        //figref=f;
        //System.out.println("Площадь равна "+figref.area());
    }
}

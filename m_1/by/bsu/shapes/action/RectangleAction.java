package m_1.by.bsu.shapes.action;

import com.sun.org.apache.regexp.internal.RE;
import m_1.by.bsu.shapes.entity.AbstractShape;
import m_1.by.bsu.shapes.entity.Rectangle;

public class RectangleAction implements IShapeAction {
    @Override
    public double computeSquare(AbstractShape shape) {
        double square = 0;
        if (shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle)shape;
            square=rectangle.getA()*rectangle.getB();
        } else{
            throw new IllegalArgumentException("Incompatible shape: "+shape.getClass());
        }
        return square;
    }

    @Override
    public double computePerimeter(AbstractShape shape) {
        double perimeter=0;
        if (shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            perimeter =2*(rectangle.getA()+rectangle.getB());
        }else{
            throw new IllegalArgumentException("incompatible shape: "+shape.getClass());
        }
        return perimeter;
    }
}

import java.applet.Applet;
import java.awt.event.*;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
public class MousePresseddemo extends Applet {
    public void init(){
        addMouseListener(new MyMouseAdapter1(this));
    }
}
class MyMouseAdapter1 extends MouseAdapter{
    MousePresseddemo mousePresseddemo;

    public MyMouseAdapter1(MousePresseddemo mousePresseddemo) {
        this.mousePresseddemo = mousePresseddemo;
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        super.mousePressed(e);
        mousePresseddemo.showStatus("Mouse Pressed");
    }
}

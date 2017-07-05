import java.applet.Applet;
import java.awt.event.*;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
public class InnerClassDemo extends Applet {
    @Override
    public void init() {
        super.init();
        addMouseListener(new MyMouseAdapter2());
    }
    class MyMouseAdapter2 extends MouseAdapter{
        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            super.mousePressed(e);
            showStatus("Мышка нажата");
        }
    }
}

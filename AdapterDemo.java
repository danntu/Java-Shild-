import java.applet.Applet;
import java.awt.event.*;
import java.awt.event.MouseEvent;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
public class AdapterDemo extends Applet {
    public void init(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}

class MyMouseAdapter extends MouseAdapter{
    AdapterDemo adapterDemo;
    public MyMouseAdapter(AdapterDemo adapterDemo){
        this.adapterDemo=adapterDemo;
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        super.mouseClicked(e);
        adapterDemo.showStatus("Mouse clicked");
    }
}
class MyMouseMotionAdapter extends MouseMotionAdapter{
    AdapterDemo adapterDemo;
    public MyMouseMotionAdapter(AdapterDemo adapterDemo){
        this.adapterDemo=adapterDemo;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        adapterDemo.showStatus("Mouse dragged");
    }
}

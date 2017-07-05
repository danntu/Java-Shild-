import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
class SampleFrame extends Frame {
    public SampleFrame(String title) throws HeadlessException {
        super(title);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener(adapter);
    }
    public void paint(Graphics g){
        g.drawString("This is in frame window ",10,40);
    }

}

class MyWindowAdapter extends WindowAdapter {

    SampleFrame sampleFrame;

    public MyWindowAdapter(SampleFrame sampleFrame) {
        this.sampleFrame = sampleFrame;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
        sampleFrame.setVisible(false);
    }
}




public class AppletFrame extends Applet {
    Frame f ;
    public void init(){
        f=new SampleFrame("A frame window");
        f.setSize(250,250);
        f.setVisible(true);
    }
    public void start(){
        f.setVisible(true);
    }
    public void stop(){
        f.setVisible(false);
    }
    public void paint(Graphics g){
        g.drawString("This is in applet window",10,20);
    }
}

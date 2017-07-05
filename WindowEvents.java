import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.GregorianCalendar;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
class SampleFrame1 extends Frame implements MouseMotionListener,MouseListener{
    String msg="";
    int mousex=10, mousey=40;
    int movx=0, movy=0;

    public SampleFrame1(String title) throws HeadlessException {
        super(title);
        addMouseListener(this);
        addMouseMotionListener(this);
        MyWindowAdapter1 windowAdapter1 = new MyWindowAdapter1(this);
        addWindowListener(windowAdapter1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mousex=10; mousey=54;
        msg="Mouse just entered child.";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mousex=10; mousey=54;
        msg="Mouse just left child window.";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mousex=e.getX();
        mousey=e.getY();
        msg="Down";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mousex=e.getX();
        mousey=e.getY();
        msg="Up";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mousex=e.getX(); mousey=e.getY();
        movx=e.getX(); movy=e.getY();
        msg="*";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        movx=e.getX(); movy=e.getY();
        repaint(0,0,100,60);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(msg,mousex,mousey);
        g.drawString("Mouse at " +movx+","+movy,10,40);
    }
}

class MyWindowAdapter1 extends WindowAdapter{
    SampleFrame1 sampleFrame1;

    public MyWindowAdapter1(SampleFrame1 sampleFrame1) {
        this.sampleFrame1 = sampleFrame1;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
        sampleFrame1.setVisible(false);
    }
}

public class WindowEvents extends Applet implements MouseListener,MouseMotionListener {
    SampleFrame1 f ;
    String msg=" ";
    int mouseX=0, mouseY=10;
    int movX=0, movY=0;

    @Override
    public void init() {
        super.init();
        f= new SampleFrame1("Handle Mouse Events");
        f.setSize(300,200);
        f.setVisible(true);

        addMouseListener(this);
        addMouseMotionListener(this);

    }

    @Override
    public void stop() {
        super.stop();
        f.setVisible(false);
    }

    @Override
    public void start() {
        super.start();f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouseX=0; mouseY=24;
        msg="Mouse just enetered applet window";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouseY=24; mouseX=0;
        msg="Mouse just left applet window";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX=e.getX(); mouseY=e.getY();
        msg="Down";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        msg="Up";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX=e.getX();
        mouseY=e.getY();
        movX=e.getX();
        movY=e.getY();
        msg="*";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        movX=e.getX();
        movY=e.getX();
        repaint(0,0,100,20);
    }

    public void paint(Graphics g){
        g.drawString(msg,mouseX,mouseY);
        g.drawString("Mouse at "+movX+","+movY,0,10);
    }

}


import java.awt.*;
import java.awt.event.*;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
public class AppWindow extends Frame {
    String keymsg="Please type text.";
    String mousemsg="";
    int mouseX=30,mouseY=30;

    public AppWindow() throws HeadlessException {
        addKeyListener(new MyKeyAdapter3(this));
        addMouseListener(new MyMouseAdapter3(this));
        addWindowListener(new MyWindowAdapter3(this));
    }
    public void paint(Graphics g){
        g.drawString(keymsg,10,40);
        g.drawString(mousemsg,mouseX,mouseY);
    }
    public static void main(String args[]){
        AppWindow window = new AppWindow();
        window.setSize(new Dimension(300,200));
        window.setTitle("An AWT-Based Application");
        window.setVisible(true);
    }
}
class MyKeyAdapter3 extends KeyAdapter{
    AppWindow window;

    public MyKeyAdapter3(AppWindow window) {
        this.window = window;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        super.keyTyped(e);
        window.keymsg+=e.getKeyChar();
        window.repaint();
    }
}
class MyMouseAdapter3 extends MouseAdapter{
    AppWindow window;

    public MyMouseAdapter3(AppWindow window) {
        this.window = window;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        window.mouseX=e.getX();
        window.mouseY=e.getY();
        window.mousemsg="Mouse Down at "+window.mouseX+","+window.mouseY;
        window.repaint();
    }
}
class MyWindowAdapter3 extends WindowAdapter{
    AppWindow window;

    public MyWindowAdapter3(AppWindow window) {
        this.window = window;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
        System.exit(0);
    }
}

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
public class SimpleKey extends Applet implements KeyListener{
    String msg="";
    int x=10, y =20;

    public void init(){
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key Down");
        int key=e.getKeyCode();
        switch (key){
            case KeyEvent.VK_F1: msg+="<F1>";break;
            case KeyEvent.VK_F2: msg+="<F2>";break;
            case KeyEvent.VK_F3: msg+="<F3>";break;
            case KeyEvent.VK_F4: msg+="<F4>";break;
            case KeyEvent.VK_F5: msg+="<F5>";break;
            case KeyEvent.VK_F6: msg+="<F6>";break;
            case KeyEvent.VK_F7: msg+="<F7>";break;
            case KeyEvent.VK_F8: msg+="<F8>";break;
            case KeyEvent.VK_F9: msg+="<F9>";break;
            case KeyEvent.VK_F10: msg+="<F10>";break;
            case KeyEvent.VK_F11: msg+="<F11>";break;
            case KeyEvent.VK_F12: msg+="<F12>";break;
            case KeyEvent.VK_SHIFT: msg+="<Shift>"; break;
            case KeyEvent.VK_ENTER: msg+="<Enter>"; break;
            case KeyEvent.VK_LEFT: msg+="<Left Arrow>"; break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("Key Up");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        msg+=e.getKeyChar();
        repaint();
    }
    public void paint(Graphics g){
        g.drawString(msg,x,y);
    }
}

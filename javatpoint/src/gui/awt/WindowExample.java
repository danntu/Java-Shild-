package gui.awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by mdaniyar on 6/8/18.
 */
public class WindowExample extends Frame implements WindowListener {
    public WindowExample() throws HeadlessException {
        addWindowListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowExample();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("iconfied");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("deiconfied");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

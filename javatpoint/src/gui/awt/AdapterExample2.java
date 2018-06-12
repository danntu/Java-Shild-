package gui.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by mdaniyar on 6/12/18.
 */
public class AdapterExample2 extends WindowAdapter {
    Frame frame;

    public AdapterExample2() {
        frame = new Frame("extending WindowAdapter");

        frame.addWindowListener(this);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        frame.dispose();
    }

    public static void main(String[] args) {
        new AdapterExample2();
    }
}

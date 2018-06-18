package gui.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mdaniyar on 6/18/18.
 */
public class Simple2 extends JFrame {
    public Simple2() throws HeadlessException {
        JButton jButton = new JButton("click me");
        jButton.setBounds(130, 100, 100, 40);
        add(jButton);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Simple2();
    }
}

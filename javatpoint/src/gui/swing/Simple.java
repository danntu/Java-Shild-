package gui.swing;

import javax.swing.*;

/**
 * Created by mdaniyar on 6/18/18.
 */
public class Simple {
    public Simple() {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("click");
        jButton.setBounds(130, 100, 100, 40);
        jFrame.add(jButton);

        jFrame.setSize(400, 400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new Simple();
    }
}

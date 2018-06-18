package gui.swing;

import javax.swing.*;

/**
 * Created by mdaniyar on 6/18/18.
 */
public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JFrame");
        JButton jButton = new JButton("click");
        jButton.setBounds(130, 100, 100, 40);
        jFrame.add(jButton);
        jFrame.setSize(400, 500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}

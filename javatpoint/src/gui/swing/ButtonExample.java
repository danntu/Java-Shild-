package gui.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 7/2/18.
 */
public class ButtonExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Button Example");
        JButton jButton = new JButton(new ImageIcon("//home/mdaniyar//power.png"));
        JTextField jTextField = new JTextField();
        jTextField.setBounds(50, 50, 150, 20);
        jButton.setBounds(50, 100, 24, 24);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("Welcome to Javatpoint");
            }
        });
        jFrame.add(jButton);
        jFrame.add(jTextField);
        jFrame.setSize(400, 400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

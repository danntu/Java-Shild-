package gui.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 7/4/18.
 */
public class TextFieldExample implements ActionListener {
    JTextField jTextField1, jTextField2, jTextField3;
    JButton buttonAdd, buttonSub;

    public TextFieldExample() {
        JFrame f = new JFrame("JTextField Example");
        jTextField1 = new JTextField();
        jTextField1.setBounds(50, 50, 150, 20);
        jTextField2 = new JTextField();
        jTextField2.setBounds(50, 100, 150, 20);
        jTextField3 = new JTextField();
        jTextField3.setBounds(50, 150, 150, 20);
        jTextField3.setEditable(false);
        buttonAdd = new JButton("+");
        buttonAdd.setBounds(50, 200, 50, 50);
        buttonSub = new JButton("-");
        buttonSub.setBounds(120, 200, 50, 50);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        f.add(jTextField1);
        f.add(jTextField2);
        f.add(jTextField3);
        f.add(buttonAdd);
        f.add(buttonSub);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonAdd) {
            jTextField3.setText(String.valueOf(Integer.parseInt(jTextField1.getText()) + Integer.parseInt(jTextField2.getText())));
        } else if (e.getSource() == buttonSub) {
            jTextField3.setText(String.valueOf(Integer.parseInt(jTextField1.getText()) - Integer.parseInt(jTextField2.getText())));
        }
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}

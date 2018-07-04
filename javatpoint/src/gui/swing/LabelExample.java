package gui.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

/**
 * Created by mdaniyar on 7/2/18.
 */
public class LabelExample extends JFrame implements ActionListener {
    JTextField jTextField;
    JLabel jLabel;
    JButton jButton;

    public LabelExample() throws HeadlessException {
        jTextField = new JTextField();
        jTextField.setBounds(50, 50, 150, 20);
        jLabel = new JLabel();
        jLabel.setBounds(50, 100, 250, 20);
        jButton = new JButton("Find IP");
        jButton.setBounds(50, 150, 95, 30);
        jButton.setSelected(true);
        jButton.addActionListener(this);
        add(jButton);
        add(jTextField);
        add(jLabel);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String host = jTextField.getText();
        try {
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            jLabel.setText("IP of " + host + " is: " + ip);
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new LabelExample();
    }
}

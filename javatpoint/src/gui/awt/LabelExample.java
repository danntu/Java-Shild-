package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class LabelExample extends Frame implements ActionListener {
    TextField textField;
    Label label;
    Button button;

    public LabelExample() throws HeadlessException {
        textField = new TextField();
        textField.setBounds(50, 50, 150, 20);
        label = new Label();
        label.setBounds(50, 100, 250, 20);
        button = new Button("Find IP");
        button.setBounds(50, 150, 60, 30);
        button.addActionListener(this);
        add(button);
        add(textField);
        add(label);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String host = textField.getText();
            String ip = InetAddress.getByName(host).getHostAddress();
            label.setText("IP of " + host + " is " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new LabelExample();
    }
}

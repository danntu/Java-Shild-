package glava31;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo extends JApplet{
    @Override
    public void init() {
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        } catch(Exception e){
            System.out.println("Can't create because of "+e);
        }
    }
    private void makeGUI(){
        JTextField textField = new JTextField("Please enter text",15);
        textField.setForeground(Color.blue);
        textField.setToolTipText("Example");
        textField.setBorder(BorderFactory.createLineBorder(Color.RED,3));
        textField.setBackground(Color.ORANGE);
        textField.setFont(new Font("Arial",20,20));
        add(textField);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showStatus(textField.getText());
            }
        });
    }
}

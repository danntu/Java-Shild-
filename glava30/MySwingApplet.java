package glava30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySwingApplet extends JApplet {
    JButton alpha, beta;
    JLabel label;
    @Override
    public void init() {
        try{
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                makeGUI();
            }
        });
        }catch (Exception e){
            System.out.println("Can't create because of "+e);
        }
    }

    private void makeGUI(){
        setLayout(new FlowLayout());
        alpha = new JButton("Alpha");
        beta = new JButton("Beta");

        alpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Alpha Pressed");
            }
        });

        beta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Beta pressed");
            }
        });

        add(alpha); add(beta);
        label = new JLabel("Press a button");
        add(label);
    }
}

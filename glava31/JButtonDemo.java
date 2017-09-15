package glava31;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo extends JApplet implements ActionListener{
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
        }catch(Exception e){
            System.out.println("Can't create because of" + e);
        }
    }

    private  void makeGUI(){
        setLayout(new FlowLayout());
        JButton jButton = new JButton("France");
        jButton.addActionListener(this);
        jButton.setActionCommand("france");
        add(jButton);

        jButton = new JButton("Germany");
        jButton.addActionListener(this);
        jButton.setActionCommand("germany");
        add(jButton);

        jButton = new JButton("Italy");
        jButton.addActionListener(this);
        jButton.setActionCommand("italy");
        add(jButton);

        label = new JLabel("Choose a flag");
        add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("You selected "+e.getActionCommand());
    }
}

package glava31;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButtonDemo extends JApplet {
    JLabel label;
    JToggleButton button;

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
        label=new JLabel("Button is off");
        button = new JToggleButton("On/Off");
        button.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(button.isSelected())
                    label.setText("Button is on");
                else
                    label.setText("Button is off");
            }
        });
        add(label);
        add(button);
    }
}

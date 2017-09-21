package glava31;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxDemo extends JApplet implements ItemListener{
    JLabel label;
    JCheckBox checkBox;

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
        setLayout(new FlowLayout());
        checkBox = new JCheckBox("C");
        checkBox.addItemListener(this);
        add(checkBox);

        checkBox = new JCheckBox("C++");
        checkBox.addItemListener(this);
        add(checkBox);

        checkBox = new JCheckBox("Java");
        checkBox.addItemListener(this);
        add(checkBox);

        checkBox = new JCheckBox("Perl");
        checkBox.addItemListener(this);
        add(checkBox);

        label = new JLabel("Select languages");
        add(label);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        checkBox = (JCheckBox) e.getItem();
        if (checkBox.isSelected())
            label.setText(checkBox.getText()+" is selected");
        else
            label.setText(checkBox.getText()+" is cleared");
    }


}

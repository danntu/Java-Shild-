package gui.awt;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by mdaniyar on 6/8/18.
 */
public class ItemListenerExample extends Frame implements ItemListener {
    Checkbox checkbox1, checkbox2;
    Label label;

    public ItemListenerExample() {
        super("CheckBox Example");
        label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        checkbox1 = new Checkbox("C++");
        checkbox1.setBounds(100, 100, 50, 50);
        checkbox2 = new Checkbox("Java");
        checkbox2.setBounds(100, 150, 50, 50);
        add(checkbox1);
        add(checkbox2);
        add(label);
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkbox1) {
            label.setText("C++ Checkbox :" + (e.getStateChange() == 1 ? "checked" : "unchecked"));
        }
        if (e.getSource() == checkbox2) {
            label.setText("Java Checkbox :" + (e.getStateChange() == 1 ? "checked" : "unchecked"));
        }
    }

    public static void main(String[] args) {
        new ItemListenerExample();
    }
}

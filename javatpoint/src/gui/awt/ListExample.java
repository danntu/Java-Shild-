package gui.awt;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by mdaniyar on 6/6/18.
 */
public class ListExample extends Frame {
    String data;

    public ListExample() throws HeadlessException {
        Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(800, 100);
        final List list1 = new List(4, false);
        list1.setBounds(100, 100, 70, 70);
        list1.add("C");
        list1.add("C++");
        list1.add("Java");
        list1.add("PHP");
        final List list2 = new List(4, true);
        list2.setBounds(100, 200, 150, 150);
        list2.add("Turbo C++");
        list2.add("Spring");
        list2.add("Hibernate");
        list2.add("CodeIgniter");
        add(label);
        add(list1);
        add(list2);
        setSize(450, 450);
        setLayout(null);
        setVisible(true);

        list1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                data = "Programming language Selected: " + list1.getSelectedItem();
                data += ", Framework Selected:";
                label.setText(data);
            }
        });
        list2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                for (String frame : list2.getSelectedItems()) {
                    data += frame + " ";
                }
                label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new ListExample();
    }
}

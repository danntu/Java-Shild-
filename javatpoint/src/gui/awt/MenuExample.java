package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by mdaniyar on 6/6/18.
 */
public class MenuExample extends Frame implements ActionListener {
    Label label;

    public MenuExample() {
        super("Menu and MenuItem Example");
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu");
        MenuItem item1 = new MenuItem("Item1");
        MenuItem item2 = new MenuItem("Item2");
        MenuItem item3 = new MenuItem("Item3");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);

        Menu subMenu = new Menu("Sub menu");
        MenuItem item4 = new MenuItem("Item4");
        MenuItem item5 = new MenuItem("Item5");
        subMenu.add(item4);
        subMenu.add(item5);

        menu.add(subMenu);
        menuBar.add(menu);
        setMenuBar(menuBar);


        menu.addActionListener(this);
        subMenu.addActionListener(this);

        label = new Label("Text");
        label.setSize(400, 100);
        label.setBounds(100, 100, 300, 100);
        add(label);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().toString() == "Item1") {
            label.setText("You chosen " + e.getActionCommand().toString());
        } else if (e.getActionCommand().toString() == "Item2") {
            label.setText("You chosen " + e.getActionCommand().toString());
        } else if (e.getActionCommand().toString() == "Item3") {
            label.setText("You chosen " + e.getActionCommand().toString());
        } else if (e.getActionCommand().toString() == "Item4") {
            label.setText("You chosen " + e.getActionCommand().toString());
        } else if (e.getActionCommand().toString() == "Item5") {
            label.setText("You chosen " + e.getActionCommand().toString());
        }
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}

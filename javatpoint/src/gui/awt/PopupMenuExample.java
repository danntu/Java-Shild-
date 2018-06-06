package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by mdaniyar on 6/6/18.
 */
public class PopupMenuExample extends Frame {
    public PopupMenuExample() throws HeadlessException {
        Frame frame = new Frame("PopupMenu Example");
        PopupMenu popupmenu = new PopupMenu();
        MenuItem cut = new MenuItem("Cut");
        popupmenu.add(cut);
        MenuItem copy = new MenuItem("Copy");
        popupmenu.add(copy);
        MenuItem paste = new MenuItem("Paste");
        popupmenu.add(paste);
        Label label = new Label();
        label.setSize(100, 100);
        label.setBounds(10, 10, 300, 100);
        cut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You selected " + e.getActionCommand());
            }
        });

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("You selected " + e.getActionCommand());
            }
        });

        paste.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You selected " + e.getActionCommand());
            }
        });

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(frame, e.getX(), e.getY());
            }
        });
        frame.add(popupmenu);
        frame.add(label);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PopupMenuExample();
    }
}

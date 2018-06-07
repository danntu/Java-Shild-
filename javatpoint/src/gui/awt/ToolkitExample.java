package gui.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mdaniyar on 6/7/18.
 */
public class ToolkitExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        System.out.println("Screen resolution = " + toolkit.getScreenResolution());
        Dimension dimension = toolkit.getScreenSize();
        System.out.println("Screen width = " + dimension.getWidth());
        System.out.println("Screen height = " + dimension.getHeight());

        Frame frame = new Frame("ToolkitExample");
        Button button = new Button("beep");
        button.setBounds(50, 100, 60, 30);
        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
        });
    }
}

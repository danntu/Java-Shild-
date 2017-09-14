package glava30;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    JLabel label,liin;
    JFrame frame;
    JButton jButtonAlpha,jButtonBeta;
    public static int sizeWidth = 400;
    public static int sizeHeight = 300;
    public static int locationX;
    public static int locationY;

    public EventDemo() {
        frame = new JFrame("ГЦВП запрос");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        locationX = (screenSize.width - sizeWidth) / 2;
        locationY = (screenSize.height - sizeHeight) / 2;
        frame.setBounds(locationX,locationY,sizeWidth,sizeHeight);

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButtonAlpha = new JButton("Alpha");
        jButtonBeta = new JButton("Beta");

        jButtonAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Alpha pressed");
            }
        });

        jButtonBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Beta pressed");
            }
        });
        liin = new JLabel("ИИН");
        frame.add(liin);
        frame.add(jButtonAlpha);
        frame.add(jButtonBeta);
        //frame.setLayout(null);
        //label= new JLabel("Press a button");
        //frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}

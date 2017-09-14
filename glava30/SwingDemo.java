package glava30;

import javax.swing.*;

public class SwingDemo {
    public SwingDemo() {
        JFrame frame = new JFrame("A Simple Application");
        frame.setSize(275,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Swing means poerful GUIs.");
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}

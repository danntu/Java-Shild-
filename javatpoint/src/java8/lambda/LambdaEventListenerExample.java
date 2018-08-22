package java8.lambda;

import javax.swing.*;

public class LambdaEventListenerExample {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);
        JButton button = new JButton("Click");
        button.setBounds(80, 100, 70, 30);
        button.addActionListener(e -> {
            textField.setText("Hello Swing");
        });

        JFrame frame = new JFrame();
        frame.add(textField);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

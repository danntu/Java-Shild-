package glava30;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class PaintPanel extends JPanel{
    Insets ins;
    Random rand;

    public PaintPanel() {
        setBorder(BorderFactory.createLineBorder(Color.RED,5));
        rand = new Random();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int x,y,x2,y2;
        int height = getHeight();
        int width = getWidth();

        ins = getInsets();
        for (int i = 0; i <10 ; i++) {
            x = rand.nextInt(width-ins.left);
            y = rand.nextInt(height-ins.bottom);
            x2 =rand.nextInt(width-ins.left);
            y2= rand.nextInt(height-ins.bottom);
            g.drawLine(x,y,x2,y2);
        }
    }
}
public class PaintDemo {
    JLabel jLabel;
    PaintPanel paintPanel;

    public PaintDemo() {
        JFrame jFrame = new JFrame("Paint Demo");
        jFrame.setSize(200,100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paintPanel = new PaintPanel();
        jFrame.add(paintPanel);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintDemo();
            }
        });
    }
}

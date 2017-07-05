import java.applet.Applet;
import java.awt.*;

/**
 * Created by DMyrzaka on 05.07.2017.
 */
public class Draw extends Applet {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //g.drawLine(0,0,100,100);
        //g.drawRect(0,0,10,10);
        //g.fillRect(0,0,30,30);
        //g.drawRoundRect(190,10,60,50,15,15);
        //g.fillRoundRect(70,90,140,100,30,40);
        //g.drawOval(10,10,50,50);
       // g.fillOval(100,10,75,50);
       // g.drawArc(10,40,70,70,0,75);
       // g.fillArc(10,100,70,80,0,175);
        int xpoints[]={30,200,30,200,30};
        int ypoints[]={30,30,200,200,30};
        int num=5;
        g.drawPolygon(xpoints,ypoints,num);

    }
}

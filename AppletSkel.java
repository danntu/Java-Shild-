import java.applet.Applet;
import java.awt.*;

/**
 * Created by DMyrzaka on 30.06.2017.
 */
public class AppletSkel extends Applet {
    String msg;
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg= "Inside init() --";
    }
    public void start(){
        msg+=" Inside start() --";
    }
    public void stop(){

    }
    public void destroy(){

    }
    public void paint(Graphics g){
        msg+=" Inside paint().";
        g.drawString(msg,10,30);
    }
}

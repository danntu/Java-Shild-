import java.applet.Applet;
import java.awt.*;

/**
 * Created by DMyrzaka on 30.06.2017.
 */

public class StatusWindow extends Applet {

    public void init(){
        setBackground(Color.cyan);
    }

    public void paint(Graphics g){
        g.drawString("This is in the applet window.",10,20);
        showStatus("This is shown in the status window.");
    }

}

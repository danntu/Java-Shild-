import java.applet.Applet;
import java.awt.*;

/**
 * Created by DMyrzaka on 10.07.2017.
 */
public class LabelDemo extends Applet {
    public void init(){
        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");

        add(one); add(two); add(three);
        
    }
}

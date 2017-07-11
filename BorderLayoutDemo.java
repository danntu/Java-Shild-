import java.applet.Applet;
import java.awt.*;

/**
 * Created by DMyrzaka on 11.07.2017.
 */
public class BorderLayoutDemo extends Applet {
    @Override
    public void init() {
            super.init();
            setBackground(Color.cyan);
            setLayout(new BorderLayout());
            add(new Button("Top Button"),BorderLayout.NORTH);
            add(new Label("Bottom Label"),BorderLayout.SOUTH);
            add(new Button("Right Button"),BorderLayout.EAST);
            add(new Button("Left Button"),BorderLayout.WEST);
            add(new TextArea("Text area some text"),BorderLayout.CENTER);
    }
    public Insets getInsets(){
        return  new Insets(20,20,20,20);
    }
}

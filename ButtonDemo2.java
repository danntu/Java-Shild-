import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by DMyrzaka on 12.07.2017.
 */
public class ButtonDemo2 extends Applet {
    MyButton myButton;
    static int i=0;

    @Override
    public void init() {
        super.init();
        myButton = new MyButton("Test Button");
        add(myButton);
    }

    class MyButton extends Button{
        public MyButton(String label) throws HeadlessException {
            super(label);
            enableEvents(AWTEvent.ACTION_EVENT_MASK);
        }
        protected void processActionEvent(ActionEvent e){
            showStatus("action event: "+i++);
            super.processActionEvent(e);
        }
    }
}

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;

/**
 * Created by DMyrzaka on 12.07.2017.
 */
public class ChoiceDemo2 extends Applet {
    MyChoice choice;

    @Override
    public void init() {
        super.init();
        choice=new MyChoice();
        choice.add("Red");
        choice.add("Green");
        choice.add("Blue");
        add(choice);
    }

    class MyChoice extends Choice{
        public MyChoice() throws HeadlessException {
            enableEvents(AWTEvent.ITEM_EVENT_MASK);
        }
        @Override
        protected void processItemEvent(ItemEvent e) {
            super.processItemEvent(e);
            showStatus("Choice selection: "+getSelectedItem());
        }
    }
}

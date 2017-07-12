import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

/**
 * Created by DMyrzaka on 12.07.2017.
 */
public class ListDemo2 extends Applet {
    MyList list;

    @Override
    public void init() {
        super.init();
        list=new MyList();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        add(list);
    }

    class MyList extends List{
        public MyList() {
            enableEvents(AWTEvent.ITEM_EVENT_MASK | AWTEvent.ACTION_EVENT_MASK);
        }

        @Override
        protected void processActionEvent(ActionEvent e) {
            super.processActionEvent(e);
            showStatus("Action Event: "+e.getActionCommand());
        }

        @Override
        protected void processItemEvent(ItemEvent e) {
            super.processItemEvent(e);
            showStatus("Item Event: "+getSelectedItem());
        }
    }
}

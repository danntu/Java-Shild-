import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;

/**
 * Created by DMyrzaka on 12.07.2017.
 */
public class CheckboxGroupDemo extends Applet {
    CheckboxGroup cbg;
    MyCheckbox myCheckbox1, myCheckbox2, myCheckbox3;

    @Override
    public void init() {
        super.init();
        cbg= new CheckboxGroup();
        myCheckbox1=new MyCheckbox("Item 1",cbg,true);
        add(myCheckbox1);
        myCheckbox2=new MyCheckbox("Item 2",cbg,false);
        add(myCheckbox2);
        myCheckbox3=new MyCheckbox("Item 3",cbg,false);
        add(myCheckbox3);

    }

    class MyCheckbox extends Checkbox{
        public MyCheckbox(String label, CheckboxGroup group, boolean state) throws HeadlessException {
            super(label, group, state);
            enableEvents(AWTEvent.ITEM_EVENT_MASK);
        }

        @Override
        protected void processItemEvent(ItemEvent e) {
            super.processItemEvent(e);
            showStatus("Checkbox name/state: "+getLabel()+"/"+getState());
        }
    }
}
